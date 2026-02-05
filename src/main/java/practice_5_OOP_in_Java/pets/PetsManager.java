package practice_5_OOP_in_Java.pets;

public class PetsManager {
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Pet " + this.pet.getName() + " is added");
    }

    public void showPetInfo(){
        this.pet.action();
        this.pet.eat();
    }
}
