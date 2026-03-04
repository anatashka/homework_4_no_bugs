package practice_8_functional_interfaces_and_lambda.part2;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,11,1,2,3,3,4,5,6,4,5,6,99);
        System.out.println("List: " + list);
        List<Integer> noDuplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("No duplicates: " + noDuplicates);
    }
}
