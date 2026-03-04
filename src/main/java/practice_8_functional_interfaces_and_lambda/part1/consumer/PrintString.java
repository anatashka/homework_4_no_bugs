package practice_8_functional_interfaces_and_lambda.part1.consumer;
import java.util.function.Consumer;
public class PrintString {
    public static void main(String[] args) {
        Consumer<String> print = (s) -> System.out.println(s);

        print.accept("Hello!");
        print.accept("How are you doing?");
    }
}
