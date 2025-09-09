package practice_3;

public class Main {
    public static void main(String[] args) {

        Library l1 = new Library("ABC", "LastNAme", 1990, "horror");
        System.out.println(l1.author + " " + l1.year + " " + l1.category);
        l1.setAuthor("NewLastName");
        l1.setYear(2000);
        l1.setCategory("fantasy");
        System.out.println(l1.author + " " + l1.year + " " + l1.category);

        /* GameSettings game1 = new GameSettings("Minecraft", 2);
        GameSettings game2 = new GameSettings("Soliter", 5);
        game1.printGameStatus();
        game2.printGameStatus();
        game1.addPlayer();
        GameSettings.setMaxPlayers(5);
        game1.addPlayer();
        game1.addPlayer();
        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();*/

        /*
        Person p1 = new Person("Tom","Hanks","1112223333");
        Person p2 = new Person("Jim","Carry","11111111");
        Person p3 = new Person("Britney","Spirs","555555555");
        p1.printPersonInfo();
        p2.printPersonInfo();
        p3.printPersonInfo();
        p1.setFirstName("Ben");
        p1.printPersonInfo();
*/
        /*University.changeUniversityName("DPI");
      University stud1 = new University("Ivan");
      stud1.printStudentInfo();
      University stud2 = new University("Dima");
      stud2.printStudentInfo();
      University stud3 = new University("Kolya");
      stud3.printStudentInfo();*/

        //Library l1 = new Library();

    /* 2:
        System.out.println(MathConstants.calculateCircleArea(5));
    System.out.println(MathConstants.calculateCircumference(5));

    System.out.println(MathConstants.calculateCircleArea(15));
    System.out.println(MathConstants.calculateCircumference(15));
    */

        //1: Company В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
//Попробуйте изменить employeeID — должно быть невозможно.
//
     /*   Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Petya");
        Company employee3 = new Company(3, "Sasha");

        Company.printCompanyName();
        Company.companyName = "Nokia";
        Company.printCompanyName();
        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();

        Company.companyName = "Tesla";
        Company.printCompanyName();

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();

        employee2.employeeID = 5;*/
    }
}
