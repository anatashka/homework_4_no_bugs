package practice_4;

import java.util.Locale;
import java.util.Scanner;

public class break_continue_problems {
    public static void main(String[] args) {
        //sumPositive();
        //printSomeNumbers();
        //waitForStop();
        printOnlyPositive();
    }

    // 4. Ввод строк до команды "stop" (использовать break)
    public static void waitForStop(){
        String command = "";
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter command: ");
            command = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (command.equals("stop")) break;
        }
    }

    // 3. Вывод только положительных чисел (использовать continue)
    public static void printOnlyPositive(){
        Scanner scanner = new Scanner(System.in);
        double num;
        do {
            System.out.print("Enter any number: ");
            num = scanner.nextDouble();

            if (num > 0) System.out.println("You entered positive number: " + num);
            if (num < 0) continue;
        }
        while (num !=0);
    }

    // 2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void printSomeNumbers(){
        for (int i=1; i<=20; i++){
            if (i%3==0) continue;
            System.out.print(i + " ");
        }
    }

    // 1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumPositive(){
        int sum = 0;
        int num = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            num = scanner.nextInt();
            if (num >= 0) {
                sum = sum + num;
            }
            else
                break;
        }
        while (num >= 0);

        System.out.println("SUM = " + sum);
    }
}
