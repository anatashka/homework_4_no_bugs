package practice_5_OOP_in_Java.zoo;

public class ZooManager {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Animal " + animal + " is added");
    }

    public void showAnimalBehavior(){
        this.animal.sound();
        this.animal.move();
    }

    public void removeAnimal(){
        System.out.println("Animal " + animal + " is removed");
        this.animal = null;
    }
}
