package practice_6_collections.b_linkedList_tasks;

import java.util.LinkedList;

public class Task_b4 {
    public int sumOfNumbersInList(){
        LinkedList<Integer> listOfNumbers = new LinkedList<>();

        for (int i = 0; i < 6; i++){
            listOfNumbers.add(3*i);
        }
        System.out.println(listOfNumbers);

        Integer sum = 0;
        for (Integer num : listOfNumbers){ sum = sum+num;}
        System.out.println("SUM = " + sum);
        return sum;
    }
}
