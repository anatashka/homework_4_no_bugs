package practice_4;

import java.util.Scanner;

public class for_problems {
    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 100, делящихся на 3
        //dividedByThree();

        // 2. Сумма чисел от 1 до n
        //countSum();

        // 3. Таблица умножения для числа
        //multiply();

        // 4. Проверка на простое число
        //isNumberSimple();

        // 5. Вывод чисел от 1 до 10
        printNumbers();
    }

    // 5. Вывод чисел от 1 до 10
    public static void printNumbers (){
        for (int i=1; i<=10; i++) System.out.println(i);
    }

    // 4. Проверка на простое число
    public static void isNumberSimple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        String result = "The number is simple";

        for (int i=2; i<num; i++)
            if (num%i == 0) result = "The number is NOT simple";

        System.out.println(result);
    }

    // 3. Таблица умножения для числа
    public static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        for (int i=1; i<=10; i++) System.out.println(num + " * " + i + " = "+ num*i);

    }

    // 2. Сумма чисел от 1 до n
    public static void countSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to which I will count SUM: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i=1;i<=num;i++) sum = sum+i;

        System.out.println("SUM = "+sum);

    }

    // 1. Вывод чисел от 1 до 100, делящихся на 3
    public static void dividedByThree(){
        for (int i=1; i<=100; i++){
            if (i%3 == 0) System.out.println(i);
        }
    }
}
