package practice_5_OOP_in_Java.aquarium;

public class Shark extends Creature{
    @Override
    void move(){
        System.out.println("swims fast");
    }
    @Override
    void behavior(){
        System.out.println("aggressive");
    }
}
