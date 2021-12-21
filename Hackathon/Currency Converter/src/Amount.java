import java.util.Scanner;
public class Amount {
    double amount;
    public double getAmount(){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the amount to be convert:");
            amount=scanner.nextDouble();
            if(amount<=0){
                throw new IllegalArgumentException("The amount cannot be negative or zero");
            }

        }catch(IllegalArgumentException iae){
            System.out.println("The amount cannot be negative or zero");
        }
        return amount;
    }

}
