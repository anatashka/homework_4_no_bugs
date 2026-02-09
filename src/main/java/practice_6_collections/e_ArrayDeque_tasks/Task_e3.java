package practice_6_collections.e_ArrayDeque_tasks;

import java.util.ArrayDeque;

public class Task_e3 {
    ArrayDeque<String> deque = new ArrayDeque<>();

    public void workWithDeque(){
        deque.add("milk");
        deque.add("bread");
        deque.add("meat");
        deque.add("fish");
        deque.add("watermelon");
        System.out.println("Initial deque: " + deque);
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Lash element: " + deque.getLast());
        deque.addFirst("ice-cream");
        deque.addLast("soap");

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Lash element: " + deque.getLast());
        System.out.println("Result deque: " + deque);
    }
}
