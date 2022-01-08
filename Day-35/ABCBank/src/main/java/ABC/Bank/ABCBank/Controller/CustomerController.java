package ABC.Bank.ABCBank.Controller;

import ABC.Bank.ABCBank.Entity.Account;
import ABC.Bank.ABCBank.Entity.Customer;
import ABC.Bank.ABCBank.Service.AccountService;
import ABC.Bank.ABCBank.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

@Controller

public class CustomerController {
    @Autowired
    private CustomerDetailsService customerService;

    @Autowired
    private AccountService accountService;
    public double accountBalance;
    public String fetchedUserName;
    public Long fetchedAccountNumber;


    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/contact")
    public String contactUs() {
        return "contact";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping("/details")
    public String details() {
        return "details";

    }


    @PostMapping("/register")
    public String register(Model model, HttpServletRequest req) {
        String customerName = req.getParameter("customerName");
        String address = req.getParameter("address");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String phoneNumber = req.getParameter("phNo");
        String emailId = req.getParameter("emailId");
        Account account = accountService.saveAccount(new Account("ABCN0008567", "Thrissur"));
        Customer customer = new Customer(customerName, address, userName, password, phoneNumber, emailId);
        customer.setAccount(account);
        customerService.saveCustomer(customer);
        model.addAttribute("message", "Registered Successfully!!!!");
        return "login";


    }

//TODO: use session or cookies
    //TODO: create new get route for details
    @PostMapping("/login")
    public String login(Model model, HttpServletRequest req) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Customer customer;
        if (customerService.existsById(username) == true) {
            customer = customerService.findById(username);
            if (password.equals(customer.getPassword())) {
               //accountBalance = customer.getAccount().getAccountBalance();
                fetchedUserName = customer.getUserName();
                fetchedAccountNumber=customer.getAccount().getAccountNumber();
                model.addAttribute("message", "Successfully logged in!!!!!!!");
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("emailId", customer.getEmailId());
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("address", customer.getAddress());
                model.addAttribute("phoneNumber", customer.getPhoneNumber());
                model.addAttribute("branchName", customer.getAccount().getBranchName());
                model.addAttribute("accountNumber", customer.getAccount().getAccountNumber());
                model.addAttribute("ifscCode", customer.getAccount().getIfscCode());


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
        model.addAttribute("account", accountService.findById(fetchedAccountNumber));
        return "viewAccountBalance";
    }
    @RequestMapping("/viewProfile")
    public String viewProfile(Model model) {
        Customer customer = customerService.findById(fetchedUserName);
        model.addAttribute("customerName", customer.getCustomerName());
        model.addAttribute("emailId", customer.getEmailId());
        model.addAttribute("userName", customer.getUserName());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("phoneNumber", customer.getPhoneNumber());
        model.addAttribute("branchName", customer.getAccount().getBranchName());
        model.addAttribute("accountNumber", customer.getAccount().getAccountNumber());
        model.addAttribute("ifscCode", customer.getAccount().getIfscCode());
        return "viewProfile";
    }





    @RequestMapping("/updateDetails/{id}")
    public String updateDetails(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("account", accountService.findById(fetchedAccountNumber));
        return "updateDetails";
    }

    @PostMapping("/updateDetails")
    public String updateDetails(Model model, HttpServletRequest req) {

        Customer customer = customerService.findById(req.getParameter("userName"));
        customer.setCustomerName(req.getParameter("customerName"));
        customer.setAddress(req.getParameter("address"));
        customer.setPassword(req.getParameter("password"));
        customer.setPhoneNumber(req.getParameter("phNo"));
        customer.setEmailId(req.getParameter("emailId"));
        customerService.saveCustomer(customer);

        model.addAttribute("customerName", customer.getCustomerName());
        model.addAttribute("userName", customer.getUserName());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("phoneNumber", customer.getPhoneNumber());
        model.addAttribute("emailId", customer.getEmailId());
        model.addAttribute("branchName", customer.getAccount().getBranchName());
        model.addAttribute("ifscCode", customer.getAccount().getIfscCode());

        model.addAttribute("accountNumber", customer.getAccount().getAccountNumber());

        return "details";
    }


    @RequestMapping("/fundTransfer")
    public String fundTransfer(Model model) {
        Account account= accountService.findById(fetchedAccountNumber);
       model.addAttribute("accountNumber",account.getAccountNumber());
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer")
    public String fundTransfer(HttpServletRequest req, Model model) {


        Long fromAccountNo = Long.parseLong(req.getParameter("fromAccountNo"));
        Long toAccountNo = Long.parseLong(req.getParameter("toAccountNo"));
        double amount = Double.parseDouble(req.getParameter("amount"));
        Account fromAccount= accountService.findById(fromAccountNo);
        Account toAccount = accountService.findById(toAccountNo);
        try{
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        else {

       if (fromAccount.getAccountBalance() > amount) {
          double accountBalanceOfCustomer1 = fromAccount.getAccountBalance() - amount;
         fromAccount.setAccountBalance(accountBalanceOfCustomer1);
          double accountBalanceOfCustomer2 = toAccount.getAccountBalance() + amount;
          toAccount.setAccountBalance(accountBalanceOfCustomer2);
                accountService.saveAccount(fromAccount);
                accountService.saveAccount(toAccount);
                model.addAttribute("transactionMessage", "Transaction successful!!!!");
            } else {
                model.addAttribute("transactionMessage", "Transaction not completed, due to insufficient balance!!!!");
            }
        }
        }catch (IllegalArgumentException iae){
            model.addAttribute("transactionMessage", "Transaction failed!!!!");
        }
        return "fundTransfer";
    }


}
