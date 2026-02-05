package practice_5_OOP_in_Java.museum;

public class Manuscript extends Exhibit{
    @Override
    void history(){
        System.out.println("Манускрипт — древний текст");
    }
    @Override
    void conditions(){
        System.out.println("Манускрипт — требует контролируемой влажности");
    }
}
