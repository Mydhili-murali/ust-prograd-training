package ABC.Bank.ABCBank.Controller;
import ABC.Bank.ABCBank.Entity.Customer;
import ABC.Bank.ABCBank.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
@Controller

public class MVCController {
    @Autowired
    private CustomerDetailsService customerService;
public double accountBalance;


    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
   @RequestMapping("/details")
   public String details(){
        return "details";
   }

    @PostMapping("/details")
    public String details(Model model, HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Customer customer;
        if(customerService.existsById(username)==true){
            customer=customerService.findById(username);
            if(password.equals(customer.getPassword())) {
                accountBalance=customer.getAccountBalance();
                model.addAttribute("message", "Successfully login!!!!!!!");
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("address",customer.getAddress());
                model.addAttribute("phoneNumber", customer.getPhoneNumber());
                model.addAttribute("branchName", customer.getBranchName());
                model.addAttribute("accountNumber", customer.getAccountNumber());
                model.addAttribute("accountBalance",customer.getAccountBalance());
                return "details";
            }
            else {
                model.addAttribute("errorMessage", "Invalid credentials!!!!!!!");
                return "login";
            }
        }
       else {
            model.addAttribute("errorMessage", "Invalid credentials!!!!!!!");
            return "login";
        }


    }
    @RequestMapping("/viewAccountBalance")
    public String viewAccountBalance(Model model){
        model.addAttribute("balance",accountBalance);
        return "viewAccountBalance";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/processRegister")
    public String processRegister(HttpServletRequest req){
        String name= req.getParameter("name");
       String address=req.getParameter("address");
        String userName=req.getParameter("username");
        String password=req.getParameter("password");
        String phoneNumber=req.getParameter("phNo");
        String branch=req.getParameter("branch");
        String accountNumber=req.getParameter("accountNo");

        Customer customer=new Customer(name,address,userName,password,phoneNumber,accountNumber,branch);
        customerService.saveCustomer(customer);
        return "processRegister";
    }



    @RequestMapping("/updateDetails/{id}")
    public String updateDetails(@PathVariable String id, Model model){
        model.addAttribute("customer",customerService.findById(id));
    return "updateDetails";
    }

    @PostMapping("/processUpdateDetails")
    public String processUpdateDetails(Model model,HttpServletRequest req){

        Customer customer =customerService.findById(req.getParameter("userName"));
        customer.setCustomerName(req.getParameter("customerName"));
        customer.setAddress(req.getParameter("address"));
        customer.setPassword(req.getParameter("password"));
        customer.setPhoneNumber(req.getParameter("phNo"));
        customer.setBranchName(req.getParameter("branch"));


        customerService.saveCustomer(customer);

//        model.addAttribute("customerName", customer.getCustomerName());
//        model.addAttribute("userName", customer.getUserName());
//        model.addAttribute("address",customer.getAddress());
//        model.addAttribute("phoneNumber", customer.getPhoneNumber());
//        model.addAttribute("branchName", customer.getBranchName());
//        model.addAttribute("accountNumber", customer.getAccountNumber());
//        model.addAttribute("accountBalance",customer.getAccountBalance());
        return "ProcessUpdateDetails";
    }

//    @PostMapping("/processUpdateDetails")
//    public String updateDetails(@ModelAttribute("customer") Customer customer,Model model,HttpServletRequest req){
//
//        model.addAttribute("customerName", customer.getCustomerName());
//        model.addAttribute("userName", customer.getUserName());
//        model.addAttribute("password", customer.getPassword());
//        model.addAttribute("address",customer.getAddress());
//        model.addAttribute("phoneNumber", customer.getPhoneNumber());
//        model.addAttribute("branchName", customer.getBranchName());
//        model.addAttribute("accountNumber", customer.getAccountNumber());
//
//
//
//        String nameUpdated= req.getParameter("name");
//        String addressUpdated=req.getParameter("address");
//        String passwordUpdated=req.getParameter("password");
//        String phoneNumberUpdated=req.getParameter("phNo");
//        String branchNameUpdated=req.getParameter("branch");
//        customerService.updateDetails(customer.getUserName(), nameUpdated,passwordUpdated,addressUpdated,phoneNumberUpdated,branchNameUpdated);
//        return "processUpdateDetails";
//    }

    @RequestMapping("/fundTransfer")
    public String fundTransfer(){
        return "fundTransfer";
    }

    @PostMapping("/processFundTransfer")
    public String processFundTransfer(HttpServletRequest req){
        String fromAccount= req.getParameter("fromAccount");
        String toAccount=req.getParameter("toAccount");
        double amount=Double.parseDouble(req.getParameter("amount"));
        Customer customer1=customerService.findByAccountNumber(fromAccount);
     Customer customer2=customerService.findByAccountNumber(toAccount);

     if(customer1.getAccountBalance()>amount){
         double accountBalanceOfCustomer1=customer1.getAccountBalance()-amount;
         customer1.setAccountBalance(accountBalanceOfCustomer1);
         double accountBalanceOfCustomer2=customer2.getAccountBalance()+amount;
         customer2.setAccountBalance(accountBalanceOfCustomer2);
         customerService.saveCustomer(customer1);
         customerService.saveCustomer(customer2);

     }

        return "processFundTransfer";
    }


}
