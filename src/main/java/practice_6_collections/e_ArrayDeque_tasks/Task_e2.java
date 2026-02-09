package practice_6_collections.e_ArrayDeque_tasks;

import java.util.ArrayDeque;

public class Task_e2 {
    ArrayDeque<String> deque = new ArrayDeque<>();

    public void reverseDeque(){
        deque.add("milk");
        deque.add("bread");
        deque.add("meat");
        deque.add("fish");
        deque.add("watermelon");

        while (!deque.isEmpty()){
            System.out.println(deque.pollLast());
        }
    }
}
