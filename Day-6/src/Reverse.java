

public class Reverse {
    public static void main(String[] args){

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello ", "good ", "morning "};
        PrintArray<Integer> printArray=new PrintArray<Integer>();
        PrintArray<String> printArray1=new PrintArray<String>();
        printArray.printArray(intArray);
        System.out.println(" ");
        printArray1.printArray(stringArray);

    }
}
class PrintArray<T> {


    public void printArray(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}