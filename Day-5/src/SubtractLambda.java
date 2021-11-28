@FunctionalInterface
interface Subtract{
    public int sub(int a,int b);
}
public class SubtractLambda {
    public static void main(String[] args){
        Subtract s= (int a, int b) -> { return (a-b);};
        System.out.println(s.sub(10,5));
    }
}
