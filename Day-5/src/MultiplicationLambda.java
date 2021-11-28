@FunctionalInterface
interface MultiplicationInterface{
    public int multi(int a,int b);
}
public class MultiplicationLambda {
    public static void main(String[] args){
        MultiplicationInterface m= (int a, int b) -> { return (a*b);};
        System.out.println(m.multi(10,5));
    }
}

