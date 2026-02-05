package practice_5_OOP_in_Java.farm;

public class Cow extends FarmAnimal{
    @Override
    void function(){
        System.out.println("Cow gives milk");
    }

    @Override
    void needs(){
        System.out.println("needs to walk on the field");
    }
}
