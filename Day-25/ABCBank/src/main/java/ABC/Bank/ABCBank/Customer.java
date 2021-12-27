package ABC.Bank.ABCBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Customer {

    String customerName;
    String userName;
    String password;
    String phoneNumber;
    String accountNumber;
    String branchName;
    double balance;


    @Autowired
    Account account;
    ArrayList<String>details=new ArrayList<>();


    public void setDetails(String customerName,String userName,String password,String phoneNumber,String accountNumber,String branchName,double balance) {
       //details.add(List.of(customerName,userName,password,phoneNumber,branchName,accountNumber));

        this.customerName = customerName;
        this.userName=userName;
        this.password=password;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.branchName=branchName;
        this.balance=balance;
    }

    public void displayAccount(){

        System.out.println("Account Holder's Name : "+customerName);
        System.out.println("Username : "+ userName);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Branch Name:"+ branchName);


    }

}

//Customer:To store information about the customers of the bank







//    public void setDetails(String customerName,String phoneNumber,String accountNumber,String branchName) {
//        details.add(customerName);
//       details.add(phoneNumber);
//        details.add(accountNumber);
//        details.add(branchName);
//    }

//    public void displayAccount(){
//        System.out.println("\n*********** First Customer's Account Details ************");
//        for(int i=0;i<details.size())
//        System.out.println("Account Balance:"+account.getBalanceCustomer());
//
//    }