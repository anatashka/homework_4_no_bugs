package practice_7.exceptions.ageException;

public class AgeCheck {
    /*
    3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
     */
    public static void main(String[] args){
        try {
            checkAge(10);
            //checkAge(-10);
            checkAge(0);
            checkAge(100);
            checkAge(150);
            checkAge(210);
        } catch (ArithmeticException a){
            System.err.println(a.getMessage());
        }
    }

    public static void checkAge(int age){
        System.out.println("You entered: " + age);
        if (age < 0) {
            throw new ArithmeticException("Age should be more than 0.");
        }
        if (age > 150){
            throw new ArithmeticException("Age should be more less than 150.");
        }
        else System.out.println("That is in accepted [0..150] age range");
    }

}
