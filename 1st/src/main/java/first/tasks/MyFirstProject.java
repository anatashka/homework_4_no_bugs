package first.tasks;

public class MyFirstProject {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(2/2);

        System.out.println(1/2);
        System.out.println(1.0/2);
        System.out.println(1/2.0);

        System.out.println("2"+"2");
        System.out.println("2"+ 5);

        //int l = 8;
        //int s = l*l;
        //System.out.println("square with side " + l + " = " + s);

        Square s = new Square(5);
        System.out.println("area with side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(9,7);
        System.out.println("area with sides " + r.a + " and " + r.b + " = " + r.area());
    }


    public static double area(Rectangle r){
        return r.a * r.b;
    }
}