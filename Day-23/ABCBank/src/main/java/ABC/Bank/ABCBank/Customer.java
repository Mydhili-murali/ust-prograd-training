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
    @Autowired
    Account account;
    public void setDetails(String customerName,String phoneNumber,String accountNumber,String branchName) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.branchName=branchName;
    }

    public void displayAccount(){
        System.out.println("\n*********** First Customer's Account Details ************");
        System.out.println("Account Holder's Name : "+customerName);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Branch Name:"+ branchName);
        System.out.println("Account Balance:"+account.getBalanceCustomer());

    }

}

//Customer:To store information about the customers of the bank

