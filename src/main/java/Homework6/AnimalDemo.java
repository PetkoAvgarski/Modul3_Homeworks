package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        Bird firstBird = new Bird();
        Cat firstCat = new Cat();
        Dog firstDog = new Dog();
        firstDog.play();
        firstCat.play();
        firstBird.play();
        firstDog.makeSomeNoise();
        firstCat.makeSomeNoise();
        firstBird.makeSomeNoise();

    }
}
