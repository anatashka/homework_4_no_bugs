package practice_6_collections.c_treeSet_tasks;

import java.util.TreeSet;

public class Task_c32 {
    TreeSet<Integer> numbersTreeSet = new TreeSet<>();

    public void createTreeSet(){

        numbersTreeSet.add(5000);
        numbersTreeSet.add(-10);
        numbersTreeSet.add(0);
        numbersTreeSet.add(5);
        numbersTreeSet.add(500);

    }
    public void addNumber(Integer number){
        if (!numbersTreeSet.contains(number)){
            numbersTreeSet.add(number);
            System.out.println("Number (" + number + ") was added.");
        }
        else
            System.out.println("Number (" + number + ") was not added as it is duplicate.");
    }

    public void printTreeSet() {
        System.out.println(numbersTreeSet);
    }
}
