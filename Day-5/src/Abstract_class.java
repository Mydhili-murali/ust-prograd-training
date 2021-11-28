abstract class Shape{
    abstract void area();
    abstract void color();
}
class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Area of rectangle: "+ l * b);
    }
    void color(){
        System.out.println("Color of Rectangle : Red");
    }
}
class Circle extends Shape{
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    void area(){
        System.out.println("Area of Circle : " + Math.PI*r*r);
    }
    void color(){
        System.out.println("Color is : Green" );
    }
}
public class Abstract_class {
    public static void main(String[] args){

        Rectangle r=new Rectangle(10,5);
        Circle c=new Circle(5);
        r.area();
        r.color();
        c.area();
        c.color();

    }
}
