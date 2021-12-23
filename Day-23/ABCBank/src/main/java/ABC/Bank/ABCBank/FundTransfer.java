package ABC.Bank.ABCBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FundTransfer {
    @Autowired
    public Account account;

    public void fundTransfer(double amount,Customer customer1,Customer customer2) {
        if (amount < account.balanceAmount) {
            customer1.account.balanceAmount = customer1.account.balanceAmount - amount;
            customer1.displayAccount();
            System.out.println("The amount " + amount + "  is debited " + " from account number "+ customer1.accountNumber+ " to account number "+ customer2.accountNumber);

            customer2.account.balanceAmount = customer2.account.balanceAmount + amount;
            customer2.displayAccount();
            System.out.println("The amount " + amount + "  is credited " + " to  account number "+ customer2.accountNumber+" from account number"+ customer1.accountNumber);
        }
    }
}

//}
//FundTransfer:To store information about the funds that are transferred from one account to the other.


