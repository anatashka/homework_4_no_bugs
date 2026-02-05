package practice_5_OOP_in_Java.amusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction){
        this.attraction = attraction;
    }

    public void attractionInfo(){
        this.attraction.info();
        this.attraction.service();
    }

}
