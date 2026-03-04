package practice_8_functional_interfaces_and_lambda.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// Напишите программу, которая принимает список чисел и отбирает только те,
// которые делятся на 5 без остатка, используя Stream API.
public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,15,35,77,33);
        System.out.println(numbers);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
