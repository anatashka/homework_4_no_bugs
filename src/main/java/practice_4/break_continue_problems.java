package practice_4;

import java.util.Locale;
import java.util.Scanner;

public class break_continue_problems {
    public static void main(String[] args) {
        //sumPositive();
        //printSomeNumbers();
        waitForStop();
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
        System.out.print("Enter some numbers: ");
        String line = scanner.nextLine();


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
