package practice_6_collections.c_treeSet_tasks;

import practice_6_collections.b_linkedList_tasks.Task_b5;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Task_c33 task_c = new Task_c33();
        task_c.createTreeSet();
        task_c.printTreeSet();
        task_c.findNeighbours(0);
        task_c.findNeighbours(-5);
        task_c.findNeighbours(-10);
        task_c.findNeighbours(500);
        task_c.findNeighbours(5000);
    }
}
