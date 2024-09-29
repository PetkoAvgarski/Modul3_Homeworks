package Homework1;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = in.nextInt();

        int newNumber1 = number2;
        int newNumber2 = number3;
        int newNumber3 = number1;

        int sum = newNumber1 + newNumber2;
        System.out.println("Тhe sum of the number 1  and number 2 is: " + sum);
        int difference = sum  - newNumber3;
        System.out.println("Тhe difference of the sum and number 3 is: " + difference);
    }

}
