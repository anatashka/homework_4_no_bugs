package practice_3;

public class Person {
    /*
    Класс Person
    Создайте класс Person с полями:
    private String firstName
    private String lastName
    private final String ssn — номер социального страхования
    Реализуйте конструктор для всех трёх полей,
    геттеры для всех полей, сеттеры только для firstName и lastName,
    метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
    В main: создайте несколько объектов, измените имя у одного и выведите информацию.
*/
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String someName, String someLastName, String someSSN){
        this.firstName = someName;
        this.lastName = someLastName;
        this.ssn = someSSN;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getSSN(){
        return this.ssn;
    }

    public void setFirstName(String someName){
        this.firstName = someName;
    }

    public void setLastName(String someLastName) {
        this.lastName = someLastName;
    }

    public void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }
}
