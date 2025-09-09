package practice_2;

public class Rectangle {
    //поля
    double width;
    double hight;

    //конструктор
    Rectangle (double someWidth, double someHight){
        this.width = someWidth;
        this.hight = someHight;
    }

    double getWidth(){
        return this.width;
    }

    double getHight(){
        return this.hight;
    }

    void setWidth(double someWidth){
        this.width = someWidth;
    }

    double calculateArea(double someWidth, double someHight){
        return someWidth*someHight;
    }


}
