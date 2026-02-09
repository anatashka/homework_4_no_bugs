package practice_6_collections.b_linkedList_tasks;

import java.util.LinkedList;

public class Task_b2 {
    public void tasks_List() {
        LinkedList<String> tasks = new LinkedList<>();
        for (int i = 0; i < 4; i++){
            tasks.add("Task #" + (i+1));
        }
        System.out.println(tasks);
        System.out.println("LinkedList has " + tasks.size() + " elements");
        int list_size = tasks.size();
        for (int i = 0; i<list_size; i++){
            System.out.println(tasks.poll() + " is executed");
        }
        System.out.println("LinkedList has " + tasks.size() + " elements");
        System.out.println(tasks);

    }}
