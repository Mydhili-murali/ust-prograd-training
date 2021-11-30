import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args){
        TreeSet<Integer>tree=new TreeSet();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students in a row:");
        int n=sc.nextInt();
        System.out.println("Enter the height of each student");
        for(int i=1;i<=n;i++){
            tree.add(sc.nextInt());
        }
        System.out.println("Students in the row standing with ascending order of their height"+ tree);

    }
}
