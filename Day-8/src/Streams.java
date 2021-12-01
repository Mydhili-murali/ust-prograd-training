import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> name=new ArrayList(List.of("nimin","mydhu","madhu","mydhili","kannan","mydhi"));
        //ArrayList<Integer> marks=new ArrayList(List.of(98,96,83,99,88));
        //System.out.println("enter the no. of people:");
       // int n=sc.nextInt();
       // System.out.print("Enter the name of each person:");
       // for(int i=1;i<=n;i++){
       //     name.add(sc.nextLine());
       // }
        System.out.println("******Sorted list****** ");
        name.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("********Names starting with m ********** ");
        name.stream()

                .filter((s)->s.startsWith("m"))
                .forEach(System.out::println);

        int count= (int) name.stream()
                        .count();
        System.out.println("   No. of people in the list: " + count);
        System.out.println("*********** After skip of 3 elements ***************");
        name.stream()
                .skip(3)
                .forEach(System.out::println);







    }
}
