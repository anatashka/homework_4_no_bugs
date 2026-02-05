package practice_5_OOP_in_Java.museum;

public class Sculpture extends Exhibit{
    @Override
    void history(){
        System.out.println("Скульптурный объект");
    }
    @Override
    void conditions(){
        System.out.println("Скульптура — нуждается в реставрации");
    }
}
