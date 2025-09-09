package practice_2;

public class Point {
    double x;
    double y;

    Point (double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    double getX(){
        return this.x;
    }

    double getY() {
        return this.y;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("X = " + this.x + ", Y = " + this.y);
    }
}
