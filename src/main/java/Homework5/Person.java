package Homework5;
import java.lang.String;
public class Person {
    String name;
    int age;
    boolean isMan;
    String gender = "woman";

    public Person(String name, int age, boolean isMan) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
    }

    public  void showPersonInfo() {
        if (isMan) {
            gender = "man";
        }
        System.out.println("The Person name is " + name + ", " + age + " years old and is " + gender + " .");
    }
}
