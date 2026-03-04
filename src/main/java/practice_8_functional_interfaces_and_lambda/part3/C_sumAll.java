package practice_8_functional_interfaces_and_lambda.part3;

import java.util.List;

//Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
public class C_sumAll {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-67,0,3,23,25,77,4,3,5);
        System.out.print(numbers);
        Integer sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(" = " + sum);
        System.out.println(-67+0+3+23+25+77+4+3+5);
    }
}
