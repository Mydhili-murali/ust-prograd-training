public class Rectangle {
    double length;
    double breadth;
     public Rectangle(double length, double breadth){
        if(length<=0||breadth<=0||length==breadth){
            throw new IllegalArgumentException("Cannot find area of rectangle");
        }
        this.length=length;
        this.breadth=breadth;

    }
    public double area(){

        return length*breadth;

    }

    public double perimeter() {

        return 2*(length+breadth);
    }
}
