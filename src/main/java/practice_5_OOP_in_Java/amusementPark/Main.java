package practice_5_OOP_in_Java.amusementPark;

public class Main {
    public static void main(){
        AmusementPark myPark = new AmusementPark();

        RollerCoaster attr1 = new RollerCoaster();
        myPark.setAttraction(attr1);
        myPark.attractionInfo();

        Carousel attr2 = new Carousel();
        myPark.setAttraction(attr2);
        myPark.attractionInfo();
    }
}
