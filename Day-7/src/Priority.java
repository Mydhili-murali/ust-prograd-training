import java.util.PriorityQueue;
import java.util.Scanner;

public class Priority {
    public static void main(String[] args){
        PriorityQueue<Integer>token= new PriorityQueue();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of tokens available");
        int n= scanner.nextInt();
        System.out.println("");
        while(n!=0){
            token.add(scanner.nextInt());
            n--;
        }
        System.out.println(token);
        System.out.println("token number that going to call");
        int t=scanner.nextInt();
        if(token.contains(t)){
            token.remove(t);
        }
        System.out.println(token);


    }
}
