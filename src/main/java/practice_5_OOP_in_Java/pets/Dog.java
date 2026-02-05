package practice_5_OOP_in_Java.pets;

public class Dog extends Pet{

    public Dog (String petName, int monthsAge){
        super(petName, monthsAge);
    }
    @Override
    void action(){
        System.out.println("Собака гуляет");
    }
    @Override
    void eat(){
        System.out.println("Собака ест сухой корм");
    }
}
