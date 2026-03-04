package practice_8_functional_interfaces_and_lambda.part2;
// Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
import java.util.List;
import java.util.stream.Collectors;

public class StringToItsLength {
    public static void main(String[] args) {
        List<String> str = List.of("We do not inherit the Earth from our ancestors; we borrow it from our children.","It is better to have less thunder in the mouth and more lightning in the hand.","Walk in balance and beauty.","Hello","Hi","I","","test");
        System.out.println(str);
        List<Integer> length = str.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
