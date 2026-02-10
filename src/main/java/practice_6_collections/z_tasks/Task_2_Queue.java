package practice_6_collections.z_tasks;

import java.util.LinkedList;

public class Task_2_Queue {
    LinkedList<String> tasks = new LinkedList<>();

    public void addTask(String task){
        tasks.addLast(task);
        System.out.println("(" + task + ") - task is added to the list");
    }

    public void executeTask(){
        System.out.println("Task (" + tasks.removeFirst() + ") is executed and removed from the list");
    }
}
