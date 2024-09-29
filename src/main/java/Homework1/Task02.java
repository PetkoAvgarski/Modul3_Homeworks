package Homework1;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1 whole number ");
        int integerNum1 = in.nextInt();
        System.out.print("Enter 2 whole number ");
        int integerNum2 = in.nextInt();
        System.out.print("Enter 1 fractional number ");
        double doubleNum1 = in.nextDouble();
        System.out.print("Enter 2 fractional number ");
        double doubleNum2 = in.nextDouble();
        int integerNumber1 = integerNum2 ;
        int integerNumber2 = integerNum1;
        double doubleNumber1 = doubleNum2;
        double doubleNumber2 = doubleNum1;
        System.out.println("The first whole number is: " + integerNumber1);
        System.out.println("The second whole number is: " + integerNumber2);
        System.out.println("The first fractional number is: " + doubleNumber1);
        System.out.println("The second fractional number is: " + doubleNumber2);
        double dNum1 = integerNumber2;
        double dNum2 = integerNumber2;
        int iNum1 = (int) doubleNumber1;
        int iNum2 = (int) doubleNumber2;
        double sum1 = dNum1 + dNum2+ iNum1 + iNum2;
        System.out.println("Sum 1 of numbers is :" + sum1);
        double dNumber1 = iNum1;
        double dNumber2 = iNum2;
        int iNumber1 = (int) dNum1;
        int iNumber2 = (int) dNum2;
        double sum2 = dNumber1 +dNumber2 + iNumber1 + iNumber2;
        System.out.println("Sum 2 of numbers is :" + sum2);
    }
}
