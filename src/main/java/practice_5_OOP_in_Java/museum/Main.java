package practice_5_OOP_in_Java.museum;

public class Main {
    public static void main(){
        MuseumManager museum = new MuseumManager();

        Manuscript manuscript = new Manuscript();
        museum.setExhibit(manuscript);
        museum.exhibitInfo();

        Sculpture sculpture = new Sculpture();
        museum.setExhibit(sculpture);
        museum.exhibitInfo();
    }
}
