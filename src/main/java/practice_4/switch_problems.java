package practice_4;

import java.util.Scanner;

public class switch_problems {
    public static void main(String[] args) {
    // 1. Вывод дня недели по номеру
    //    System.out.println(dayOfTheWeek());


        // 2. Определите стоимость билета в кино:
        //System.out.println(ticketPrice());

        System.out.println(marks());
    }

//


    // 3. Программа принимает число от 0 до 100 и переводит его в буквенную оценку по шкале:
    //90–100 — A
    //80–89 — B
    //70–79 — C
    //60–69 — D
    //ниже 60 — F
    public static char marks() {
        Scanner scanner = new Scanner(System.in);
        char mark = 'F';

        System.out.print("Enter your mark (0-100): ");
        int num = scanner.nextInt();

        switch (num/10) {
            case 6:
                mark = 'D';
                break;
            case 7:
                mark = 'C';
                break;
            case 8:
                mark = 'B';
                break;
            case 9:
                mark = 'A';
                break;
            case 10:
                mark = 'A';
                break;
        }
        return mark;
        }
    // 2. Определите стоимость билета в кино:
    //будние дни (1–5) — 300 рублей
    //выходные (6–7) — 450 рублей
    public static int ticketPrice() {
        Scanner scanner = new Scanner(System.in);
        int price = 0;

        System.out.print("Enter number of the day the week (1-7): ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                price = 300;
                break;
            case 2:
                price = 300;
                break;
            case 3:
                price = 300;
                break;
            case 4:
                price = 300;
                break;
            case 5:
                price = 300;
                break;
            case 6:
                price = 450;
                break;
            case 7:
                price = 450;
                break;
        }
        return price;
    }
    // 1. Реализуйте программу, которая принимает с консоли число от 1 до 7 и выводит название соответствующего дня недели (например, 1 — "Понедельник").
    public static String dayOfTheWeek(){
        Scanner scanner = new Scanner(System.in);
        String dayName;

        System.out.print("Enter number of the day the week (1-7): ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "wrong number";
        }
        return dayName;
    }
}
