package practice_5_OOP_in_Java.aquarium;

public class AquariumManager {
    private Creature c;

    public void addCreature(Creature creature){
        this.c = creature;
        System.out.println(this.c + " is added to the aquarium");
    }

    public void creatureInfo(){
        this.c.move();
        this.c.behavior();
    }
}
