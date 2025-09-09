package practice_3;

public class Company {

static String companyName; //— общее название для всех сотрудников
final int employeeID; //— уникальный идентификатор (нельзя менять)
String employeeName; //— имя сотрудника

    /* Реализуйте конструктор, принимающий employeeID и employeeName, статический метод printCompanyName(),
геттеры и сеттеры для employeeName.
В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
Попробуйте изменить employeeID — должно быть невозможно.
     */

    Company (int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static  void printCompanyName(){
        System.out.println(Company.companyName);
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    void printInfo(){
        System.out.println(this.companyName + " " + this.employeeID + " " + this.employeeName );

    }
}
