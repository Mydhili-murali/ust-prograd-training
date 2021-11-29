

public class Reverse {
    public static void main(String[] args){

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "good", "morning"};
        PrintArray<Integer> printArray=new PrintArray<Integer>();
        PrintArray<String> printArray1=new PrintArray<String>();
        printArray.printArray(intArray);
        printArray1.printArray(stringArray);

    }
}
class PrintArray<T> {


    public void printArray(T[] array) {
        Object[] newArray = new Object[array.length];
        for (int i=0;i<array.length; i++)
        {
            newArray[i] = array[array.length-i-1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(newArray[i]);

        }


    }
}