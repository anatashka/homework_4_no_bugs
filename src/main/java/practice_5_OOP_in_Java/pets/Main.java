package practice_5_OOP_in_Java.pets;

public class Main {
    public static void main(){
        PetsManager petsManager = new PetsManager();

        Dog dog = new Dog("dog",10);
        petsManager.addPet(dog);
        petsManager.showPetInfo();

        Cat cat = new Cat("cat", 11);
        petsManager.addPet(cat);
        petsManager.showPetInfo();

        Parrot p = new Parrot("p", 15);
        petsManager.addPet(p);
        petsManager.showPetInfo();
    }
}
