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
}





