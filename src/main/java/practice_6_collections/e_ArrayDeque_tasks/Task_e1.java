package practice_6_collections.e_ArrayDeque_tasks;

import java.util.ArrayDeque;

public class Task_e1 {
    ArrayDeque<String> deque = new ArrayDeque<>();

    public void createDeque(){
        deque.add("milk");
        deque.add("bread");
        deque.add("meat");
        deque.add("fish");
        deque.add("watermelon");

        System.out.println(deque);
    }
}
