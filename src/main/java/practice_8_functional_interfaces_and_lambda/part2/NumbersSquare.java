package practice_8_functional_interfaces_and_lambda.part2;

import java.util.List;
import java.util.stream.Collectors;

//Напишите программу, которая принимает список чисел и преобразует его в новый список,
// где каждое число заменено на его квадрат, используя Stream API.
public class NumbersSquare {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5,6,7,8,9,10);
        System.out.println("Initial list: " + numbers);
        List<Integer> results = numbers.stream()
                .map(n -> n *n)
                .collect(Collectors.toList());
        System.out.println("Result list: " + results);

    }
}
