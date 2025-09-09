package practice_3;

public class University {
    /*
     Класс University
    Создайте класс University с полями:
    static String universityName — общее имя университета
    final int studentID — уникальный ID
    String studentName
    Реализуйте конструктор для studentID и studentName,
    статический метод changeUniversityName(String newName),
    геттер для studentName,
    метод printStudentInfo() — выводит имя, ID и университет.
    В main: создайте 3 студента, измените название университета и выведите данные.
     */

    static String universityName; // общее имя университета
    final int studentID; // уникальный ID
    String studentName;
    static int count;

    public University(String someName) {
        count++;
        this.studentID = count;
        this.studentName = someName;
    }

    public static void changeUniversityName(String newName){
        universityName = newName;
    }

    public String getStudentName (){
        return this.studentName;
    }

    public void printStudentInfo(){
        System.out.println(this.studentName + " " + this.studentID + " " + universityName );
    }

}
