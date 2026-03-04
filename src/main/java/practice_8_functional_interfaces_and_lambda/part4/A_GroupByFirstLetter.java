package practice_8_functional_interfaces_and_lambda.part4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
public class A_GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> list = List.of("Sam","Fred","Anna","Sonya","Beatha","Kate","Ken","Barbara");
        System.out.println(list);
        Map<Character, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(result);
    }
}
