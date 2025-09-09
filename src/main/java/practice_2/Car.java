package practice_2;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand(){
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String someBrand){
        this.brand = someBrand;
    }

    void setYear(int someYear){
        this.year = someYear;
    }

    void print(){
        System.out.println(this.brand + " brand is from " + this.year + " year.");
    }
}
