package Homework6;

public class Bird extends Animal implements IAnimal {
    @Override
    public void makeSomeNoise() {
        System.out.println("The bird chirps");
    }

    @Override
    public void play() {
        System.out.println("The bird is playing");
    }

    public void fly() {
        System.out.println("The bird is flying");
    }

    public void sing(int numberOfBirds) {
        if (numberOfBirds == 1) {
            System.out.println("The bird sings");
        } else if (numberOfBirds > 1) {
            System.out.println("The birds sing louder");
        } else {
            System.out.println("There are no birds to sing");
        }
    }

}
