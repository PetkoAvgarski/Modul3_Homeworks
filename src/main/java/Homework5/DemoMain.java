package Homework5;

import java.util.Arrays;
import java.lang.String;

public class DemoMain {
    public static void main(String[] args) {
        Person[] people = new Person[10];


        people[0] = new Person("Ivan", 24, true);
        people[1] = new Person("Iliana", 14, false);
        people[2] = new Student("Petia", 20, false, 4.56);
        people[3] = new Student("Kaloian", 30, true, 3.45);
        people[4] = new Employee("Kalina", 17, false, 14.50);
        people[5] = new Employee("Teodor", 36, true, 42.5);

        for (Person person : people) {
            if (person != null) {
                if (person instanceof Student) {
                    ((Student) person).showStudentInfo();
                } else if (person instanceof Employee) {
                    ((Employee) person).showEmployeeInfo();
                } else {
                    person.showPersonInfo();
                }
                System.out.println();
            }
        }
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                double overtimePay = employee.calculateOvertime(2); // 2 часа overtime
                System.out.println("Overtime pay for " + employee.name + ": " + overtimePay);
            }
        }
    }
}
