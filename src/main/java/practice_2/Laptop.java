package practice_2;

public class Laptop {
    String brand;
    double price;

    Laptop (String someName, double somePrice){
        this.brand = someName;
        this.price = somePrice;
    }

    String getBrand(){
        return this.brand;
    }

    double getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println(this.brand + " is $" + this.price);
    }
}
