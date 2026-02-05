package practice_5_OOP_in_Java.pets;

public class Cat extends Pet{

    public Cat (String petName, int monthsAge){
        super(petName, monthsAge);
    }
    @Override
    void action(){
        System.out.println("Кошка играет");
    }
    @Override
    void eat(){
        System.out.println("Кошка ест влажный корм");
    }
}
