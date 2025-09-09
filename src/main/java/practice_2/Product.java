package practice_2;

public class Product {
    String name;
    double price;

    Product (String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return  this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice (double newPrice){
        this.price = newPrice;
    }

    double applyDiscount(int discount){
        if (this.price !=0)
            return (double)this.price - discount*this.price/100;
        else
            return 0;
    }

    void printInfo(){
        System.out.println("товар: " + this.name + " стоит " + this.price);
    }
}
