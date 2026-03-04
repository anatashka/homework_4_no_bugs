package practice_8_functional_interfaces_and_lambda.part2;

import java.util.List;
import java.util.stream.Collectors;

//Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
public class FilterLength5 {
    public static void main(String[] args) {
        List<String> s = List.of("aaaaaaaa","b","cc","ddd","eeee","fffff","gggggg","hhhhhhh");
        System.out.println("Before: " + s);
        List<String> result = s.stream()
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList());
        System.out.println("After: " + result);
    }


}
