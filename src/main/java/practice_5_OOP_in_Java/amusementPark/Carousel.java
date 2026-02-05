package practice_5_OOP_in_Java.amusementPark;

public class Carousel extends Attraction{
    @Override
    void info(){
        System.out.println("Карусель — спокойный аттракцион");
    }
    @Override
    void service(){
        System.out.println("Карусель — техническое обслуживание");
    }
}
