package practice_7_exceptions_generics.exceptions.division;
/*
2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

 */

import java.sql.SQLException;

public class DivisionCheck {
    public static void main(String[] args) {
        divide(4,0);
        divide(100,0);
        divide(10, 0);
        divide(15, 3);
        divide(10, 2);
    }

    public static double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new SQLException("Деление на ноль!");
            }
            double result = (double) a / b;
            System.out.println(a + " / " + b + " = " + result);
            return result;
        } catch (SQLException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return 0;
        }
    }
}

