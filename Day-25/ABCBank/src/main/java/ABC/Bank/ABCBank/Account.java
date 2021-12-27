package ABC.Bank.ABCBank;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Account {

    ArrayList<String>nameList=new ArrayList<>(List.of("Mydhili Murali","Nimin Murali"));
    ArrayList<String>accountNumberList=new ArrayList<>(List.of("1234534562","3244534562"));


    public void displayAccountOfCustomer(Customer customer) {
       if(nameList.contains(customer.customerName)&&accountNumberList.contains(customer.accountNumber)) {

           customer.displayAccount();
           System.out.println("Account Balance:"+customer.balance);


        }
    }


}
//Account:To store information about the existing accounts of the bank
