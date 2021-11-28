
import java.util.Scanner;

class BankAccount{
    String name;
    String accno;
    int total=1000;
    BankAccount(String name, String accno)
    {
        this.name=name;
        this.accno=accno;
    }
    public void display()
    {
        System.out.println("Name:"+ this.name +" \nAccount number: "+ this.accno);
    }



    public void deposit(int amount) {
        System.out.println(name +" deposited "+ amount);
        total=total+amount;
        System.out.println("Total amount in the account: "+ total );
    }

    public void withdrawal(int amt) {
        if(total>amt)
        {

                System.out.println(name + " withdrawn " + amt + " from account number " + accno);
                total = total - amt;
                System.out.println("Total amount after withdrawal is " + total);



        }
        else{
            System.out.println("Cannot withdraw the amount "+ amt+ " due to insufficient balance");
            System.out.println("Your balance is: "+ total);

        }
    }
}

public class Account {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the account number: ");
        String account = scanner.nextLine();
        BankAccount ob1=new BankAccount(name,account);
        while(true) {
            System.out.println("Enter a choice from( 1- 3 )......1.Display details....2.Deposit......3.Withdrawal.........");
            int choice = scanner.nextInt();
            if (choice >= 4) {
                break;
            }

            switch (choice) {
                case 1:

                    ob1.display();
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposit:");
                    int amount = scanner.nextInt();
                    ob1.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to be withdraw: ");
                    int amt = scanner.nextInt();
                    ob1.withdrawal(amt);
                    break;

                default:
                    System.out.println("Enter valid choice....");
                    break;
            }

        }

    }
}