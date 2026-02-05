package practice_5_OOP_in_Java.botanicGarden;

public class BotanicGarden {
    private Plant plant;

    public void addPlant(Plant p){
        this.plant = p;
        System.out.println("Added " + this.plant);
    }

    public void plantInfo(){
        this.plant.requirements();
    }

}
