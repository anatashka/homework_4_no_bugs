package practice_5_OOP_in_Java.aquarium;

public class StarFish extends Creature{
    @Override
    void move(){
        System.out.println("crawls on the ocean floor");
    }
    @Override
    void behavior(){
        System.out.println("slowly");
    }
}
