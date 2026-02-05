package practice_5_OOP_in_Java.restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    void  showDishInfo(){
        System.out.println("Drink's volume is " + this.volume + "ml");
    };
}
