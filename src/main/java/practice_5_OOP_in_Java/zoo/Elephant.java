package practice_5_OOP_in_Java.zoo;

public class Elephant extends Animal{
    @Override
    void sound() {
        System.out.println("sound: pawoo");
    }
    @Override
    void move() {
        System.out.println("movement: walk");
    }
}
