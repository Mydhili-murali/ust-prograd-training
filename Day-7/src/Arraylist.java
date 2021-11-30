//ArrayList.........


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer>empId= new ArrayList(20);
        ArrayList<Integer>list=new ArrayList();
        ArrayList<String>name=new ArrayList(20);

       empId.add(100);
       empId.add(1,101);
        list.add(102);
        list.add(103);
        list.add(104);
        empId.addAll(2,list);
        //System.out.println(empId);
        name.add("Mydhili");
        name.add("Salini");
        name.add("Anju");
        name.add("Radha");
       // empId.forEach(n-> System.out.println(n));
       // name.forEach(s-> System.out.println(s));
        System.out.println("......Employee Details are given below.....");

        if(empId.isEmpty()==true){
            System.out.println("please enter the deatils");
        }
        else {
            for (int i = 0; i < empId.size(); ) {
                int j = 0;
                System.out.println("Employee Id:" + empId.get(i) + "   Employee Name: " + name.get(j));
                i++;
                j++;
            }
        }
        //System.out.println(empId.isEmpty());




    }
}
