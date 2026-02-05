package practice_5_OOP_in_Java.zoo;

public class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("sound: tweet-tweet-tweet");
    }
    @Override
    void move() {
        System.out.println("movement: fly");
    }
}
