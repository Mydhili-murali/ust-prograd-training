import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args){
        Vector<String> vector= new Vector(8);
        vector.add("carrot");
        vector.add("tomato");
        vector.add("onions");
        vector.addElement("potato");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.elementAt(2));
        System.out.println(vector.contains("tomato"));
        System.out.println(vector.lastElement());
        vector.removeElement("tomato");
        System.out.println(vector);
        vector.forEach(veg-> System.out.println(veg));
    }
}
