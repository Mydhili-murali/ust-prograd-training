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
    public String fetchedUserName;

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/details")
    public String details() {
        return "details";
    }

    @PostMapping("/login")
    public String login(Model model, HttpServletRequest req) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Customer customer;
        if (customerService.existsById(username) == true) {
            customer = customerService.findById(username);
            if (password.equals(customer.getPassword())) {
                accountBalance = customer.getAccountBalance();
                fetchedUserName = customer.getUserName();
                model.addAttribute("message", "Successfully login!!!!!!!");
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("address", customer.getAddress());
                model.addAttribute("phoneNumber", customer.getPhoneNumber());
                model.addAttribute("branchName", customer.getBranchName());
                model.addAttribute("accountNumber", customer.getAccountNumber());
                return "details";

            } else {
                model.addAttribute("errorMessage", "Invalid credentials!!!!!!!");
                return "login";
            }
        } else {
            model.addAttribute("errorMessage", "Invalid credentials!!!!!!!");
            return "login";
        }


    }

    @RequestMapping("/viewAccountBalance")
    public String viewAccountBalance(Model model) {
        Customer customer=customerService.findById(fetchedUserName);
        model.addAttribute("balance", customer.getAccountBalance());
        return "viewAccountBalance";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model, HttpServletRequest req) {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String phoneNumber = req.getParameter("phNo");
        String branch = req.getParameter("branch");
        String accountNumber = req.getParameter("accountNo");

        Customer customer = new Customer(name, address, userName, password, phoneNumber, accountNumber, branch);
        customerService.saveCustomer(customer);
        model.addAttribute("registerSuccessMessage", "Registered Successfully!!!!");
        return "login";
    }


    @RequestMapping("/updateDetails/{id}")
    public String updateDetails(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "updateDetails";
    }

    @PostMapping("/updateDetails")
    public String updateDetails(Model model, HttpServletRequest req) {

        Customer customer = customerService.findById(req.getParameter("userName"));
        customer.setCustomerName(req.getParameter("customerName"));
        customer.setAddress(req.getParameter("address"));
        customer.setPassword(req.getParameter("password"));
        customer.setPhoneNumber(req.getParameter("phNo"));
        customer.setBranchName(req.getParameter("branch"));


        customerService.saveCustomer(customer);

        model.addAttribute("customerName", customer.getCustomerName());
        model.addAttribute("userName", customer.getUserName());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("phoneNumber", customer.getPhoneNumber());
        model.addAttribute("branchName", customer.getBranchName());
        model.addAttribute("accountNumber", customer.getAccountNumber());

        return "details";
    }


    @RequestMapping("/fundTransfer")
    public String fundTransfer(Model model) {
        Customer customer=customerService.findById(fetchedUserName);
        model.addAttribute("accountNumber",customer.getAccountNumber());
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer")
    public String fundTransfer(HttpServletRequest req, Model model) {


        String fromAccount = req.getParameter("fromAccount");
        String toAccount = req.getParameter("toAccount");
        double amount = Double.parseDouble(req.getParameter("amount"));
        Customer customer1 = customerService.findByAccountNumber(fromAccount);
        Customer customer2 = customerService.findByAccountNumber(toAccount);
        try{
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        else {

            if (customer1.getAccountBalance() > amount) {
                double accountBalanceOfCustomer1 = customer1.getAccountBalance() - amount;
                customer1.setAccountBalance(accountBalanceOfCustomer1);
                double accountBalanceOfCustomer2 = customer2.getAccountBalance() + amount;
                customer2.setAccountBalance(accountBalanceOfCustomer2);
                customerService.saveCustomer(customer1);
                customerService.saveCustomer(customer2);
                model.addAttribute("transactionMessage", "Transaction successful!!!!");
            } else {
                model.addAttribute("transactionMessage", "Transaction not completed!!!!");
            }
        }
        }catch (IllegalArgumentException iae){
            model.addAttribute("transactionMessage", "Transaction not completed!!!!");
        }
        return "fundTransfer";
    }


}
