package practice_8_functional_interfaces_and_lambda.part4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
public class B_GroupEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);

        Map<Boolean,List<Integer>> result = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(result);

    }
}
