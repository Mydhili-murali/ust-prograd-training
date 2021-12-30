package ABC.Bank.ABCBank.Controller;
import ABC.Bank.ABCBank.Entity.Customer;
import ABC.Bank.ABCBank.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
@Controller

public class MVCController {
    @Autowired
    private CustomerDetailsService customerService;

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {

        return "login";

    }

    @PostMapping("/details")
    public String details(Model model, HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Customer customer;
        if(customerService.existsById(username)==true){
            customer=customerService.findById(username);
            if(password.equals(customer.getPassword())) {
                model.addAttribute("message", "Successfully login!!!!!!!");
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("address",customer.getAddress());
                model.addAttribute("phoneNumber", customer.getPhoneNumber());
                model.addAttribute("branchName", customer.getBranchName());
                model.addAttribute("accountNumber", customer.getAccountNumber());
                return "details";
            }
            else {
                return "invalidUser";
            }
        }
       else {
            return "invalidUser";
        }


    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/processRegister")
    public String processRegister(Model model, HttpServletRequest req){
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

//    @PostMapping("/details")
//
//    public String details(Model model, HttpServletRequest req) {
//       String name= req.getParameter("name");
//       String address=req.getParameter("address");
//        String userName=req.getParameter("username");
//        String password=req.getParameter("password");
//        String phoneNumber=req.getParameter("phNo");
//        String branch=req.getParameter("branch");
//        String accountNumber=req.getParameter("accountNo");
//
//        Customer customer=new Customer(name,address,userName,password,phoneNumber,accountNumber,branch);
//        customerService.saveCustomer(customer);
//
//
//        model.addAttribute("message", "Successfully registered!!!!!!!");
//        model.addAttribute("customerName", name);
//        model.addAttribute("userName", userName);
//        model.addAttribute("address",address);
//        model.addAttribute("phoneNumber", phoneNumber);
//        model.addAttribute("branchName", branch);
//        model.addAttribute("accountNumber", accountNumber);
//
//
//        return "details";
//    }



//    @RequestMapping("/details")
//    public String details(Model model, HttpServletRequest req) {
//        Map<String, ArrayList<String>> userDetails = new HashMap<>();
//        ArrayList<String> details1 = new ArrayList<>(List.of("Mydhili Murali", "mydhili123@mydhili", "9876452341", "Vallachira", "1234534562"));
//        ArrayList<String> details2 = new ArrayList<>(List.of("Nimin Murali", "nimin123@nimin", "9845231234", "Kunnamangalam", "3212345234"));
//        ArrayList<String> detailsList = new ArrayList<>();
//        userDetails.put("mydhilimurali", details1);
//        userDetails.put("niminmurali", details2);
//
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        if (userDetails.containsKey(username)) {
//            for (Map.Entry<String, ArrayList<String>> value : userDetails.entrySet()) {
//                detailsList = value.getValue();
//                if (detailsList.contains(password)) {
//                    model.addAttribute("message", "Login successful!!!!!!!");
//                    model.addAttribute("customerName", detailsList.get(0));
//                    model.addAttribute("phoneNumber", detailsList.get(2));
//                    model.addAttribute("branchName", detailsList.get(3));
//                    model.addAttribute("accountNumber", detailsList.get(4));
//
//                }
//                else{
//                    model.addAttribute("errorMessage","Invalid user!!!!!!");
//                }
//            }
//        }
//
//        return "details";
//    }
}
