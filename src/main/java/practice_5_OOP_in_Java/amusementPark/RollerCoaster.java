package practice_5_OOP_in_Java.amusementPark;

public class RollerCoaster extends Attraction{
    @Override
    void info(){
        System.out.println("Американские горки — острые ощущения");
    }
    @Override
    void service(){
        System.out.println("Американские горки — проверка безопасности");
    }
}
