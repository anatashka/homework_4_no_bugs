package practice_8_functional_interfaces_and_lambda.part3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
public class B_min {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,3,99,4,5,555,232,1,0,-78);
        System.out.println(numbers);
        Optional<Integer> result = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println(result.get());
    }
}
