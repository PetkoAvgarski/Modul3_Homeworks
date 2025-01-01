package Homework2;

public class  Task05 {
    public static void main(String[] args) {
        int[] intArray = {10, 12, 1, 8, 4};
        int[] newIntArray = new int[intArray.length];
        System.out.print("Contents of newIntArray[] are: ");
        for (int i = 0; i < intArray.length; i++) {
            newIntArray[i] = intArray[i];
            System.out.print(newIntArray[i] + "  ");
        }
    }
}
