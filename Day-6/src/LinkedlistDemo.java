import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args){
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("rat");
        linkedList.add("rabbit");
        System.out.println(linkedList);
        linkedList.remove(3);
        System.out.println(linkedList);
        linkedList.forEach(animals-> System.out.println(animals));
        System.out.println(linkedList.lastIndexOf("rat"));
        linkedList.addLast("elephant");
        System.out.println(linkedList);


    }
}

