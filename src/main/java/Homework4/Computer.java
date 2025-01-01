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

    static  int comparePrice(double a, double b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        } else {
            return 0;
        }
    }


}

