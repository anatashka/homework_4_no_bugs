package practice_4;

import java.util.Scanner;

import static java.lang.System.in;

public class if_else_problems {

    public static void main(String[] args) {

        // 1. Определение знака числа
        //defineNegativePositive();

        // 2. Поиск наибольшего из двух чисел
        //findMax();

        // 3. Вывод оценки по шкале 1–5
        //markDefinition();

        // 4. Проверка на чётность
        //System.out.println(defineOddEven());

        // 5. Определение размера скидки по возрасту
        //System.out.print("Sale % is: " + saleAmount());

        // 6. Оценка результата теста по баллам
        System.out.println(testResult());
    }
    /*1. Определение знака числа
       Задача:
       Напишите программу, которая принимает с консоли число и проверяет:
       Если число больше 0, выведите "Число положительное".
       Если меньше 0 — "Число отрицательное".
       Если равно 0 — "Число равно нулю".
       Методы и конструкции:
       Scanner
       if, else if, else
           System.out.println()*/
    public static void defineNegativePositive (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        String result = "";
        if (num < 0) {
            result = "Число отрицательное";
        }
        else if (num > 0) {
            result = "Число положительное";
        }
            else {
                result = "Число равно нулю";
        }
        System.out.println(result);
    }

       /* 2. Поиск наибольшего из двух чисел
    Задача:
    Создайте программу, которая принимает два числа и выводит наибольшее из них.
    Методы и конструкции:
    Scanner
if-else или Math.max()
System.out.println()*/

    public static void findMax () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();

        int result = num2;

        if (num1 > num2) {
            result = num1;
        }

        System.out.println("max number is " + result);
    }
      /*  3. Вывод оценки по шкале 1–5
    Задача:
    Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
            5 — "Отлично"
            4 — "Хорошо"
            3 — "Удовлетворительно"
            2 или 1 — "Неудовлетворительно"
    Методы и конструкции:
    Scanner
    switch-case или if-else if
            System.out.println() */
      public static void markDefinition () {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter mark number from 1 to 5: ");
          int num = scanner.nextInt();

          String result = "Неудовлетворительно";

          if (num == 5) {
              result = "Отлично";
          }

          if (num == 4) {
              result = "Хорошо";
          }

          if (num == 3) {
              result = "Удовлетворительно";
          }

          if ((num < 1) || (num>5)) {
              result = "you do not follow the task and entered something that is not a number from 1 to 5";
          }
          System.out.println(result);
      }
       /*     4. Проверка на чётность
    Задача:
    Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
    Методы и конструкции:
    Scanner
if-else, оператор %
            System.out.println()*/

    public static String defineOddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        String result = "чётное";

        if (num%2 == 1) {
            result = "нечётное";
        }
        return result;
    }


    /* 5. Определение размера скидки по возрасту
    Задача:
    Напишите программу, которая определяет размер скидки:
    До 18 лет — 25%
    От 65 и старше — 30%
    Остальные — без скидки
    Методы и конструкции:
    Scanner
if, else if, else
        System.out.println()*/

     public static int saleAmount(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter age: ");
         int age = scanner.nextInt();
         int result = 0;

         if (age < 18) {
             result = 25;
         }
         if (age > 65) {
             result = 30;
         }
         return result;
     }

     /*   6. Оценка результата теста по баллам
    Задача:
    Программа принимает число — результат теста (0–100) и выводит:
            90 и выше — "Отлично"
            75–89 — "Хорошо"
            60–74 — "Удовлетворительно"
    ниже 60 — "Неудовлетворительно"
    Методы и конструкции:
    Scanner
if, else if, else
        System.out.println()*/
     public static String testResult(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter test result (0-100): ");
         int testResult = scanner.nextInt();
         String resultMessage = "Неудовлетворительно";

         if ((testResult >=60)&&(testResult<=74)) {
             resultMessage = "Удовлетворительно";
         }
         if ((testResult >=75)&&(testResult<=89)) {
             resultMessage = "Хорошо";
         }
         if (testResult >=90) {
             resultMessage = "Отлично";
         }
         return resultMessage;
     }
}
