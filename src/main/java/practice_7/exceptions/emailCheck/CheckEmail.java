package practice_7.exceptions.emailCheck;
import java.util.regex.Pattern;
public class CheckEmail {
    /*
    4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
     */
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

        public static void validateEmail(String email) {
            if (email == null || !PATTERN.matcher(email).matches()) {
                throw new IllegalArgumentException("Некорректный формат email: " + email);
            }
            System.out.println("Email " + email + " валиден.");
        }

        public static void main(String[] args) {
            validateEmail("test@example.com");
            validateEmail("wrong-email");
        }
    }
