public class Calculator {

    public double addition(int a, int b) {
        return a+b;
    }

    public double subtraction(int a, int b) {
        return a-b;
    }

    public double multiplication(int a, int b) {
        return a*b;
    }

    public double division(int a, int b) {
        if(b==0)
        {
            throw new ArithmeticException("Cannot divide by zero...");
        }
        return a/b;
    }
}
