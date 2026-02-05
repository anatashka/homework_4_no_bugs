package practice_5_OOP_in_Java.farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal animal){
        this.farmAnimal = animal;
        System.out.println("Added to the farm: " + this.farmAnimal);
    }

    public void farmAnimalInfo(){
        this.farmAnimal.function();
        this.farmAnimal.needs();
    }
}
