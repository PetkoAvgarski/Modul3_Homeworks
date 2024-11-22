package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public static int comparePrice(double a, double b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static class ComputerPrices {
        public static void main(String[] args) {
            Computer comp1 = new Computer(2021, 852.45, "Windows");

            Computer comp2 = new Computer(2024, 1081.78, "Linux");
            int result = comparePrice(comp1.price, comp2.price);

            System.out.println(result);
        }
    }
}

