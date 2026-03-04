package practice_8_functional_interfaces_and_lambda.part3;

import java.util.List;
import java.util.Optional;

//Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
// который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
public class E_atLeastOne {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,11,32,43,67,5,57);
        System.out.println(numbers);
        Boolean result = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(result);
    }
}
