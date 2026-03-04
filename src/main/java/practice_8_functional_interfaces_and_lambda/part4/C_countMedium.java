package practice_8_functional_interfaces_and_lambda.part4;

import java.util.List;
import java.util.stream.Collectors;

//Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
public class C_countMedium {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100,1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);

        Double medium = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(medium);
        System.out.println((100+1+2+3+4+5+6+7+8+9+10)/11);


    }
}
