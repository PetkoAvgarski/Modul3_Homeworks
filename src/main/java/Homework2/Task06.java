package Homework2;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        if (Arrays.equals(firstArray, secondArray))
            System.out.println("The Arrays are equal");
        else
            System.out.println("The Arrays aren`t equal");
    }
}
