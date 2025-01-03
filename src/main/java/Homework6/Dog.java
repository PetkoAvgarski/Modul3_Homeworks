package Homework6;

public class Dog extends Animal implements IAnimal{
    @Override
    public void makeSomeNoise() {
        System.out.println("The dog is barking");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing");
    }
    public void bringStick(){
        System.out.println("The dog brought a stick");
    }
}
