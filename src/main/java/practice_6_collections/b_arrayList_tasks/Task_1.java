package practice_6_collections.b_arrayList_tasks;

import java.util.ArrayList;

public class Task_1 {
    //create Array that contains 5 digits and add one more at the end of the list. Print out all Array
   public void addElementToArray() {
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);

       numbers.add(99);

       System.out.println(numbers);
   }
}
