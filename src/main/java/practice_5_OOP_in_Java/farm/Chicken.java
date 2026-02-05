package practice_5_OOP_in_Java.farm;

public class Chicken extends FarmAnimal{
    @Override
    void function(){
        System.out.println("Chicken gives eggs");
    }

    @Override
    void needs(){
        System.out.println("needs grains");
    }
}
