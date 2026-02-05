package practice_5_OOP_in_Java.restaurant;

public class Main {

    public static void main(String[] args) {
        RestaurantManager restik = new RestaurantManager();
        Brisket brisket = new Brisket(350);

        restik.addDish(brisket);
        restik.showDishInfo();

        Drink drink = new Drink(200);
        restik.addDish(drink);
        restik.showDishInfo();



    }
}
