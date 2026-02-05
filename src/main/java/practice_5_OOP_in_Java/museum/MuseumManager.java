package practice_5_OOP_in_Java.museum;

public class MuseumManager {
    private Exhibit exhibit;

    public void setExhibit(Exhibit e){
        this.exhibit = e;
    }

    public void exhibitInfo(){
        this.exhibit.history();
        this.exhibit.conditions();
    }
}
