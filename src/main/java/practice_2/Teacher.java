package practice_2;

public class Teacher {
    String name;
    String subject;

    Teacher (String newName, String newSubject){
        this.name = newName;
        this.subject = newSubject;
    }

    String getName(){
        return this.name;
    }

    String getSubject(){
        return  this.subject;
    }

    void setName (String newName){
        this.name = newName;
    }

    void setSubject (String newSubject){
        this.subject = newSubject;
    }

    void printInfo(){
        System.out.println(this.name + " преподает " + this.subject);
    }
}
