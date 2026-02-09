package practice_6_collections.b_arrayList_tasks;

import java.util.ArrayList;

public class Task_2 {
    //Print all odd numbers that are present in Array
    public void allEvenNumbersFromArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(99);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(998);
        numbers.add(1);
        numbers.add(2);
        numbers.add(36);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9922);

        for (int i = 0; i< numbers.size(); i++){
            if (numbers.get(i)%2==0) System.out.println(numbers.get(i));
    }
}
}
