class Rectangle{
    public double l;
    public double b;
    public double area()
    {
        return l*b;
    }
}
class Cuboid extends Rectangle{
    public double h;
    public double volume()
    {
        return area()*h;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Cuboid ob1=new Cuboid();
        ob1.l=5;
        ob1.b=2;
        ob1.h=6;
        System.out.println("Volume of cuboid is : " + ob1.volume());
    }
}
