package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;
    String typeOfCar;

    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel)
            System.out.println("Not enough free fuel!");
        else
            freeFuel -= fuel;
    }

    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.year = 2016;
        firstCar.price = 2100.45;
        firstCar.isSportCar = false;
        firstCar.fuelTankCapacity = 58.5;
        firstCar.freeFuel = 40.34;
        firstCar.engineFuelOperationSystem = "Diesel";

        Car secondCar = new Car();
        secondCar.year = 2024;
        secondCar.price = 114300.45;
        secondCar.isSportCar = true;
        secondCar.fuelTankCapacity = 90.5;
        secondCar.freeFuel = 70.45;
        secondCar.engineFuelOperationSystem = "Gasoline";

        secondCar.useFuel(35.0);
        firstCar.changeЕngineFuelOperationSystem("Gasoline");
        if (firstCar.isSportCar) {
            firstCar.typeOfCar = "is Sport Car";
        } else {
            firstCar.typeOfCar = "is`t Sport Car";
        }
        System.out.println("The first car was produced in " + firstCar.year + ", it costs BGN " + firstCar.price + ", it " + firstCar.typeOfCar + ", the tank is " + firstCar.fuelTankCapacity + " liters, and there are " + firstCar.freeFuel + " liters of " + firstCar.engineFuelOperationSystem + " in it");
        if (secondCar.isSportCar) {
            secondCar.typeOfCar = "is Sport Car";
        } else {
            secondCar.typeOfCar = "is`t Sport Car";
        }
        System.out.println("The second car was produced in " + secondCar.year + ", it costs BGN " + secondCar.price + ", it " + secondCar.typeOfCar + ", the tank is " + secondCar.fuelTankCapacity + " liters, and there are " + secondCar.freeFuel + " liters of " + secondCar.engineFuelOperationSystem + " in it");

    }
}





