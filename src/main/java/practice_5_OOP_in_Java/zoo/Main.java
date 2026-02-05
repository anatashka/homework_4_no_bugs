package practice_5_OOP_in_Java.zoo;

public class Main {
    public static void main(String[] args){
        ZooManager zoo = new ZooManager();
        Bird parrot = new Bird();
        zoo.addAnimal(parrot);
        zoo.showAnimalBehavior();
        //zoo.removeAnimal();

        Elephant elli = new Elephant();
        zoo.addAnimal(elli);
        zoo.showAnimalBehavior();
        //zoo.removeAnimal();
    }
}
