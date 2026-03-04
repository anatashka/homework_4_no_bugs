package practice_8_functional_interfaces_and_lambda.part1.predicate;

import java.util.function.Predicate;

//Напишите лямбду, которая проверяет, является ли число чётным.
public class PredicateTask {
    public static void main(String[] args) {
        Predicate<Integer> result = n -> n % 2 == 0;

        System.out.println(result.test(5));
        System.out.println(result.test(0));
        System.out.println(result.test(2));
        System.out.println(result.test(100));
    }
}
