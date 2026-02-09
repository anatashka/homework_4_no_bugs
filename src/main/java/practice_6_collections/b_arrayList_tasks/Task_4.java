package practice_6_collections.b_arrayList_tasks;

import java.util.ArrayList;

public class Task_4 {
    public void arraySum(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(-100);
        numbers.add(1000);
        numbers.add(-10000);
        /*numbers.add();
        numbers.add();
        numbers.add();
        numbers.add();
        numbers.add();*/

        Integer sum = 0;
        for (int i=0; i<numbers.size(); i++) sum = sum+numbers.get(i);
        System.out.println("SUM = " + sum);
    }
}
