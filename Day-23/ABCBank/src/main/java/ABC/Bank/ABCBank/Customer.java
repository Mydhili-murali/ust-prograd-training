package ABC.Bank.ABCBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {
    String customerName;
    String phoneNumber;
    String accountNumber;
    String branchName;
    double balance;


    @Autowired
    Account account;


    public void setDetails(String customerName,String phoneNumber,String accountNumber,String branchName,double balance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.branchName=branchName;
        this.balance=balance;
    }

    public void displayAccount(){

        System.out.println("Account Holder's Name : "+customerName);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Branch Name:"+ branchName);


    }

}

//Customer:To store information about the customers of the bank

