import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lh=new LinkedHashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of employees: ");
        int m=sc.nextInt();

        System.out.println("***Enter the employee_id and name of each employee***");
        for (int i = 1; i <= m; i++) {
            lh.put(sc.nextInt(), sc.nextLine());
        }
        System.out.println("******Name------------->Salary");
        for(Map.Entry<Integer,String>n:lh.entrySet()){
            System.out.println(n.getKey()+" --------> " + n.getValue());

        }
        System.out.println("Enter the employee_id to be searched:");
        int id=sc.nextInt();
        for(Map.Entry<Integer,String>n:lh.entrySet()){
        if(id==n.getKey()){
            System.out.println(id+"  is present....");
        }


        }


        }

        }


