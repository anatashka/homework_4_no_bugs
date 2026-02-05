package practice_5_OOP_in_Java.restaurant;

public class Brisket extends Dish{
    private int temperature;

    public Brisket(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    void  showDishInfo(){
        System.out.println("Temperature is " + this.temperature + "F");
    };
}
