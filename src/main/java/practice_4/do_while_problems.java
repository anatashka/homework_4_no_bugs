package practice_4;

import java.util.Locale;
import java.util.Scanner;

public class do_while_problems {
    public static void main(String[] args) {
        //positiveNumberRequest();
        /*askPassword("");
        askPassword("pwd");
        askPassword("password");*/
        //printNumbers();
        //waitForExit();
        countDigits();

    }
    //5. Подсчёт количества цифр в числе
    public static void countDigits(){
        System.out.print("Enter positive number: ");
        Scanner numScanner = new Scanner(System.in);
        int num = numScanner.nextInt();
        int digits = 0;
        do {
            if (num > 1) {
                num = (int) num/10;
                digits++;
            }
            else digits++;
        }
        while (num>1);

        System.out.println("There are " + digits + " digits.");
    }

    // 4. Завершение программы по команде "exit"
    public static void waitForExit(){
        String command = "";
        do {
            System.out.print("Enter command: ");
            Scanner numScanner = new Scanner(System.in);
            command = numScanner.nextLine().toLowerCase(Locale.ROOT);
        }
        while (!command.equals("exit"));
    }
    // 3. Вывод чисел от 1 до 10 с использованием do-while
    public static void printNumbers(){
        int number =1;
        do {
            System.out.println(number);
            number++;
        }
        while (number <= 10);
    }

    // 2. Проверка пароля
    public static void askPassword(String correctPassword){
        String password = "";

        do {
            System.out.print("Enter password: ");
            Scanner numScanner = new Scanner(System.in);
            password = numScanner.nextLine();
        }
        while (!password.equals(correctPassword));

        System.out.println("Welcome!");
    }




    // 1. Запрос положительного числа
    public static void positiveNumberRequest(){
        int num = 0;

        do {
            System.out.print("Enter positive number: ");
            Scanner numScanner = new Scanner(System.in);
            num = numScanner.nextInt();
        }
        while (num<=0);

        System.out.println("Thank you!");


    }
}
