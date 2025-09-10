package practice_4;

import java.util.Scanner;

public class while_problems {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("1. Вычисление факториала с помощью while");
        //factorial();
        System.out.println("********************************************************");
        System.out.println("2. Вывод всех чётных чисел до заданного");
        //evenNumbers();
        System.out.println("********************************************************");
        System.out.println("3. Обратный отсчёт от введённого числа до 1");
        backwardCount();

    }
    // 3. Обратный отсчёт от введённого числа до 1
    public static void backwardCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number > 0 : ");
        int number = scanner.nextInt();

        System.out.println("Backward count is:");
        while (number >= 1){
            System.out.print(number + " ");
            --number;
        }
    }

    // 2. Вывод всех чётных чисел до заданного
    public static void evenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number till which I will display even numbers: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i<=number){
            if (i%2==0) System.out.println(i);
            i++;
        }
    }

    // 1. Вычисление факториала с помощью while
    public static void factorial (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to count factorial: ");
        int number = scanner.nextInt();
        int i = 1;
        int result = 1;

        while (i<=number){
            result = result*i;
            i++;
        }
        System.out.println("Factorial = " + result);
    }
}
