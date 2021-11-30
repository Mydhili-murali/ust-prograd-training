import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<String> stack=new Stack<String>();
        stack.push("apple");
        stack.push("orange");
        stack.push("pineapple");
        stack.push("kiwi");
        stack.push("banana");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.indexOf("pineapple"));
    }
}
