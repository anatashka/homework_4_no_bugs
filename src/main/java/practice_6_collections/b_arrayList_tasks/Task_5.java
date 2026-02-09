package practice_6_collections.b_arrayList_tasks;

import java.util.ArrayList;

public class Task_5 {
    //show max number from integer array
    public void maxInteger(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(-100);
        numbers.add(1000);
        numbers.add(10000);
        /*numbers.add();
        numbers.add();
        numbers.add();
        numbers.add();
        numbers.add();*/

        Integer max = numbers.get(0);
        for (int i=1; i<numbers.size(); i++)
            if (max < numbers.get(i))
                max = numbers.get(i);
        System.out.println("MAX = " + max);
    }
}
