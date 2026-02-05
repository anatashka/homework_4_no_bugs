package practice_5_OOP_in_Java.restaurant;

public class RestaurantManager {
    private Dish d;

    public void addDish(Dish d){
        this.d = d;
        System.out.println("Dish " + this.d + " is added");
    };

    public void showDishInfo(){
        this.d.showDishInfo();
    }



}
