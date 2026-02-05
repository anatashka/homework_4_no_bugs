package practice_5_OOP_in_Java.farm;

public class Main {
    public static void main() {
        Farm farm = new Farm();

        Cow cow = new Cow();
        farm.addFarmAnimal(cow);
        farm.farmAnimalInfo();

        Chicken chicken = new Chicken();
        farm.addFarmAnimal(chicken);
        farm.farmAnimalInfo();
    }
}