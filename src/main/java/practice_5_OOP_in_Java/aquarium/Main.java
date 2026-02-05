package practice_5_OOP_in_Java.aquarium;

public class Main {
    public static void main(){
        AquariumManager aquariumAustin = new AquariumManager();

        Shark shark = new Shark();
        aquariumAustin.addCreature(shark);
        aquariumAustin.creatureInfo();

        StarFish star = new StarFish();
        aquariumAustin.addCreature(star);
        aquariumAustin.creatureInfo();

    }
}
