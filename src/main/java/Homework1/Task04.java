package Homework1;
import  java.util.Scanner;
public class Task04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter working hours: ");
        int workingHours = in.nextInt();

        System.out.print("Enter Amount of money: ");
        float amountOfMoney = in.nextFloat();

        System.out.print("Enter whether it is a holiday (true or false): ");
        boolean isHoliday = in.nextBoolean();

            if (! isHoliday){
                System.out.println("I will work");
            }else if ( amountOfMoney == 0){
                System.out.println("I will stay at home and watch TV ");
            }else if (amountOfMoney < 10 ){
                System.out.println("I will go for ice cream");
            }else {
                System.out.println("I will go to the cinema");
            }
    }
}
