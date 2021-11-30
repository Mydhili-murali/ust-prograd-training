import java.util.ArrayDeque;
import java.util.Scanner;


public class Arraydeque {
    public static void main(String[] args)
    {
        ArrayDeque people=new ArrayDeque();
        Scanner sc=new Scanner(System.in);

        System.out.println("Tickets that people  taken: ");

               // people.add(1);
                //people.add(2);
                //people.add(3);
                //people.add(4);
        for(int i=1;i<=10;i++)
        {
            people.add(sc.nextInt());
        }

            System.out.println(people);
        //people.forEach(x-> System.out.println(x));
        System.out.println("after leaving one person from queue");
        people.poll();//  1 person removed from queue
        if(people.size()==10)
        {
            System.out.println("Tickets booking is over...");
        }
        else {
            System.out.println("Booking is going on...");
        }
       // System.out.println(people.poll());
        System.out.println(people);


    }
}
