package practice_8_functional_interfaces_and_lambda.part1.function;

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> length = (s) -> s.length();

        System.out.println(length.apply("Hello from anonymous class!"));
        System.out.println(length.apply("Hello!"));
        System.out.println(length.apply("class"));
    }
}
