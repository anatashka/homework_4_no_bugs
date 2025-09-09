package practice_2;

public class Main {
    public static void main(String[] args) {

        //Task #10: Создайте класс Laptop с полями brand и price.
        // Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
        // В main измените цену и выведите информацию.
    Laptop l1 = new Laptop("Apple", 1000);
    l1.printInfo();
    l1.setPrice(1500);
    l1.printInfo();
        //Task #9: Создайте класс Product с полями name и price.
        // Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки, и метод printInfo(),
        // выводящий информацию о товаре и цене.
        // В main измените цену, примените скидку и выведите цену.
    /*Product p1 = new Product("apples",5);
    p1.printInfo();
    p1.setPrice(10);
    p1.printInfo();
    p1.setPrice(p1.applyDiscount(20));
    p1.printInfo();*/

        //Task #8: Создайте класс Teacher с полями name и subject.
        // Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
        // В main измените предмет и выведите обновлённую информацию.
        /*Teacher t1 = new Teacher ("John Smith", "math");
        t1.printInfo();
        t1.setSubject("Geometry");
        t1.printInfo();*/

        //Task #7: Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
        // В main измените радиус, выведите площадь и длину окружности.
    /*Circle circle1 = new Circle(5);
    System.out.println("Area: " + circle1.calculateArea(circle1.getRadius()));
    System.out.println("Circumference: " + circle1.calculateCircumference(circle1.getRadius()));

    circle1.setRadius(9);
    System.out.println("Area: " + circle1.calculateArea(circle1.getRadius()));
    System.out.println("Circumference: " + circle1.calculateCircumference(circle1.getRadius()));*/

        //Task #6: Создайте класс StudentGroup с полями groupName и studentCount.
        // Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о группе и количестве студентов.
        // В main измените число студентов и выведите информацию.
    /*StudentGroup group1 = new StudentGroup("Alpha", 10);
    group1.printInfo();
    group1.setStudentCount(25);
    group1.printInfo();*/

        //Task #5: Создайте класс Point с координатами x и y.
        // Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты.
        // В main измените x, выведите новые координаты.
    /*Point p1 = new Point(5,7);
    p1.print();
    p1.setX(27);
    p1.print();*/
        //Task #4: Создайте класс BankAccount с полями owner и balance.
        // Реализуйте конструктор, геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
        // В main внесите деньги, снимите и выведите баланс.
    /*BankAccount user1 = new BankAccount("Ivanov", 999);
    user1.printBalance();
    user1.deposit(2000);
    user1.printBalance();
    user1.withdraw(1000);
    user1.printBalance();*/
        //Task #3: Создайте класс Book с полями title и author.
        // Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
        // В main создайте книгу, измените автора и выведите информацию.
    /*Book myBook = new Book("Little Prins","Erzupery");
    myBook.printInfo();
    myBook.setAuthor("Saint-Exupery");
    myBook.setTitle(("The Little Prince"));
    myBook.printInfo();*/
        //Task #2: В main создайте прямоугольник, измените ширину и выведите площадь.
    /*Rectangle rectangle1 = new Rectangle(5.5,3);
    System.out.println("прямоугольник c шириной " + rectangle1.getWidth() + " и длиной " + rectangle1.getHight());
    System.out.println("Rectangle area is " + rectangle1.calculateArea(rectangle1.width, rectangle1.hight));

    rectangle1.setWidth(7);
    System.out.println("прямоугольник c шириной " + rectangle1.getWidth() + " и длиной " + rectangle1.getHight());
    System.out.println("Rectangle area is " + rectangle1.calculateArea(rectangle1.width, rectangle1.hight));*/

     //Task #1: В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
     /*   Car volvo = new Car("volvo", 2010);
        Car toyota = new Car("TOYOTA", 2022);
        Car tesla = new Car("Tesla", 2025);

        volvo.print();
        toyota.print();
        tesla.print();

        volvo.setYear(2015);
        volvo.print();

        toyota.setBrand("Toyota");
        toyota.print();
        */
    }
}
