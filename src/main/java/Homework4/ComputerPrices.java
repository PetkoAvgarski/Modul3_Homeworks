package Homework4;

import static Homework4.Computer.comparePrice;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2021, 852.45, "Windows");

        Computer comp2 = new Computer(2024, 1081.78, "Linux");


        System.out.println( comparePrice(comp1.price, comp2.price));
    }


}
