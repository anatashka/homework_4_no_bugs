package practice_6_collections.c_linkedHashSet_tasks;

import practice_6_collections.b_linkedList_tasks.Task_b5;

public class Main {
    public static void main(String[] args) {
        Task_c22 task_c = new Task_c22();
        task_c.createLinkedHashSet();
        task_c.printSet();

        task_c.addIfNotDuplicate("apple");
        task_c.addIfNotDuplicate("blueberries");
        task_c.addIfNotDuplicate("banana");
        task_c.printSet();

    }
}
