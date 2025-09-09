package practice_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount (String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }
    String getOwner (){
        return this.owner;
    }

    void setOwner(String someOwner){
        this.owner = someOwner;
    }
    // метод deposit(amount)
    void deposit (double amount){
        this.balance = this.balance + amount;
    }

    // withdraw(amount)
    void withdraw (double amount){
        this.balance = this.balance - amount;
    }
    // метод printBalance()
    void printBalance(){
        System.out.println("У пользователя " + this.owner + " баланс: " + this.balance);
    }
}
