interface MyTest{
    void calculate();
}
class Addition implements MyTest{
    int a,b;

     Addition(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void calculate(){
        System.out.println("addition of " +a + " and "+ b + " : " + (a+b));
    }


}
 class Subtraction implements MyTest{
    int a,b;
    Subtraction(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
     public void calculate(){
         System.out.println("Subtraction of " +a + " and "+ b + " : " + (a-b));
     }
}
class Multiplication implements MyTest{
    int a,b;
    Multiplication(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void calculate(){
        System.out.println("Multiplication of " +a + " and "+ b + " : " + (a*b));
    }
}
public class Interface {
    public static void main(String[] args){
        Addition ob1= new Addition(10,5);
        Subtraction ob2= new Subtraction(10,5);
        Multiplication ob3=new Multiplication(10,5);
        ob1.calculate();
        ob2.calculate();
        ob3.calculate();

    }
}
