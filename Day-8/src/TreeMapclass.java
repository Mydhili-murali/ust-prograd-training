import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapclass {
    public static void main(String[] args){
        TreeMap<Integer,String>tm=new TreeMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students in a class:");
        int n=sc.nextInt();
        System.out.println("Enter the height and name of each student");
        for(int i=1;i<=n;i++){
            tm.put(sc.nextInt(),sc.nextLine());
        }
        System.out.println("******Height------------->Name");
        for(Map.Entry<Integer,String>m:tm.entrySet()){
            System.out.println(m.getKey()+" --------> " + m.getValue());

        }
        for(Map.Entry<Integer,String>m:tm.entrySet()){
            if(m.getKey()<=160){
                System.out.println(m.getValue()+"  Must be stand in 1st row");
            }
            else if(m.getKey()<=165)
            {
                System.out.println(m.getValue()+"  Must be in 2nd row");
            }
            else
            {
                System.out.println(m.getValue()+ " stand in 3rd row");
            }
        }
        System.out.println("******headmap  tailmap   submap*********");
        System.out.println("headmap:"+ tm.headMap(sc.nextInt()));
        System.out.println("tailmap:"+ tm.tailMap(sc.nextInt()));
        System.out.println("Submap:" + tm.subMap(sc.nextInt(), sc.nextInt()));



    }
}
