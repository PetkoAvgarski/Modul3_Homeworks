package Homework5;

public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        if ((score < 2) || (score > 6)) {
            System.out.println("The score isn`t valid.");
        } else if (isMan) {
            gender = "man";
        }
        System.out.println("The Student name is " + name + ", " + age + " years old and is " + gender + " . His score is " + score);
    }
}
