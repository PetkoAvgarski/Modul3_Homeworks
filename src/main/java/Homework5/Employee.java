package Homework5;

public class Employee extends Person {
    double daySalary;
    double hours;
    double overtimeDaySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            overtimeDaySalary = 0;
        } else {
            overtimeDaySalary = hours * (daySalary * 1.5);
        }
        return overtimeDaySalary;
    }

    public void showEmployeeInfo() {
        if (isMan) {
            gender = "man";
        }
        System.out.println("The Employee name is " + name + ", " + age + " years old and is " + gender + " . His day salary is " + daySalary);
    }
}
