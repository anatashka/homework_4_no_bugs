package practice_3;

public class Library {
    /*Класс Library — модификаторы доступа
    Создайте класс Library с полями:
    private String bookTitle
    protected String author
    int year (default-доступ)
    public String category
    Реализуйте геттеры и сеттеры для всех полей.
     */
    //В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.*/
    private String bookTitle;// = "Alice in Wonderland";
    protected String author; // = "Lewis Carroll";
    int year; // = 1865; //(default-доступ)
    public String category; // = "Portal fantasy";

    public Library (String someTitle, String someAuthor, int someYear, String someCategory){
        this.bookTitle = someTitle;
        this.author = someAuthor;
        this.year = someYear;
        this.category = someCategory;
    }

    private String getBookTitle() {
        return this.bookTitle;
    }

    protected String getAuthor(){
        return this.author;
    }

    int getYear(){
        return this.year;
    }

    public String getCategory(){
        return this.category;
    }

    private void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    protected void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    public void setCategory(String newCategory){
        this.category = newCategory;
    }

}
