package Homework6;

public class Cat extends Animal implements IAnimal{
    @Override
    public void makeSomeNoise() {
        System.out.println("The cat meows");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }
    public void climb(){
        System.out.println("The cat is climbing ");
    }
}
