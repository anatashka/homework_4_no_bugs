package practice_2;

public class Book {
    String title;
    String author;

    Book (String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    String getTitle(){
        return  this.title;
    }
    String getAuthor(){
        return  this.author;
    }

    void setTitle(String someTitle){
        this.title = someTitle;
    }

    void setAuthor(String someAuthor){
        this.author = someAuthor;
    }

    void printInfo(){
        System.out.println("Книга: " + this.title + " автор: " + this.author);
    }
}
