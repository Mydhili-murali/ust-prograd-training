import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashset {
    public static void main(String[] args){
        LinkedHashSet lh=new LinkedHashSet();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. of students in the class: ");
        int n=scanner.nextInt();
        System.out.println("Enter the roll number of each student:");
        for(int i=1;i<=n;i++) {
            lh.add(scanner.nextInt());
        }
        System.out.println("Strength of the class:"+  lh.size());
        System.out.println("students with roll numbers"+ lh);
        System.out.println("Enter the roll number to be searched: ");
        int t= scanner.nextInt();
        if(lh.contains(t)){
            System.out.println("Student "+t + " is present.");
        }
        else{
            System.out.println(t+ " is Absent");
        }
    }
}
