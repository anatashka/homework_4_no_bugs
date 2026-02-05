package practice_5_OOP_in_Java.pets;

public abstract class Pet {
    private String name;
    private int age; //age in months

    public String getName(){
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Pet (String petName, int monthsAge){
        this.name = petName;
        this.age = monthsAge;
    }

    abstract void action();
    abstract void eat();
}
