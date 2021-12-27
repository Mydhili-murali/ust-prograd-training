package ABC.Bank.ABCBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class FundTransfer {
    @Autowired
    public Account account;
//    @Autowired
//    public Customer customer1,customer2;
//    public void fundTransfer(double amount,String accountNumber1,String accountNumber2) {
//        for(Map.Entry<String,String>n:customer1.)
//        if (amount < account.balanceAmount) {
//            customer1.account.balanceAmount = customer1.account.balanceAmount - amount;
//            customer1.displayAccount();
//            System.out.println("The amount " + amount + "  is debited " + " from account number "+ customer1.accountNumber+ " to account number "+ customer2.accountNumber);
//
//            customer2.account.balanceAmount = customer2.account.balanceAmount + amount;
//            customer2.displayAccount();
//            System.out.println("The amount " + amount + "  is credited " + " to  account number "+ customer2.accountNumber+" from account number"+ customer1.accountNumber);
//        }
//    }
//}

    public void fundTransfer(double amount,Customer customer1,Customer customer2) {
        if (amount < customer1.balance) {
            System.out.println("\n*********** First Customer's Account Details ************");
            System.out.println("Old balance : "+  customer1.balance);
            customer1.balance = customer1.balance - amount;
            account.displayAccountOfCustomer(customer1);
            System.out.println("The amount " + amount + "  is debited " + " from account number "+ customer1.accountNumber+ " to account number "+ customer2.accountNumber);
            System.out.println("\n*********** Second Customer's Account Details ************");
            System.out.println("Old balance : "+  customer2.balance);
            customer2.balance = customer2.balance + amount;
            account.displayAccountOfCustomer(customer2);
            System.out.println("The amount " + amount + "  is credited " + " to  account number "+ customer2.accountNumber+" from account number"+ customer1.accountNumber);
        }
    }
}


//FundTransfer:To store information about the funds that are transferred from one account to the other.


