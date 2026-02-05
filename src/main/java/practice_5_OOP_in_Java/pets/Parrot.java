package practice_5_OOP_in_Java.pets;

public class Parrot extends Pet{

    public Parrot (String petName, int monthsAge){
        super(petName, monthsAge);
    }

    @Override
    void action() {
        System.out.println("Parrot flies");
    }

    @Override
    void eat() {
        System.out.println("Parrot eats seads");
    }
}
