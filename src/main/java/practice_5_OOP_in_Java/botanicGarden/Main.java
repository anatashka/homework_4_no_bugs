package practice_5_OOP_in_Java.botanicGarden;

public class Main {
    public static void main(){
        BotanicGarden garden = new BotanicGarden();

        Orchidea orchidea = new Orchidea();
        garden.addPlant(orchidea);
        garden.plantInfo();

        Cactus cactus = new Cactus();
        garden.addPlant(cactus);
        garden.plantInfo();
    }
}
