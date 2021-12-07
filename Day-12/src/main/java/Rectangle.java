public class Rectangle {
    public double area(double l, double b){
        if(l<=0||b<=0||l==b){
            throw new IllegalArgumentException("Cannot find area of rectangle");
        }
        return l*b;

    }

    public double perimeter(double l, double b) {
        if(l<=0||b<=0||l==b){
            throw new IllegalArgumentException("Cannot find perimeter of rectangle");
        }
        return 2*(l+b);
    }
}
