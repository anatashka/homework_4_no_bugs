package practice_6_collections.e_PriorityQueue_tasks;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(1000);
        numbers.add(1000);
        numbers.add(-5);
        numbers.add(-15);
        numbers.add(50);
        numbers.add(0);
        numbers.add(100);
        System.out.println(numbers);

        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
