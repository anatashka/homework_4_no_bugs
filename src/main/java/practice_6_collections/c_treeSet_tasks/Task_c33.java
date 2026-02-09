package practice_6_collections.c_treeSet_tasks;

import java.util.TreeSet;

public class Task_c33 {
    TreeSet<Integer> numbersTreeSet = new TreeSet<>();

    public void createTreeSet(){

        numbersTreeSet.add(5000);
        numbersTreeSet.add(-10);
        numbersTreeSet.add(0);
        numbersTreeSet.add(5);
        numbersTreeSet.add(500);

    }

    public void printTreeSet() {
        System.out.println(numbersTreeSet);
    }
    public void findNeighbours(Integer number){
        if (numbersTreeSet.contains(number)){
            System.out.println("Checking neighbours for number " + number);
            System.out.println("Closest smaller number is " + numbersTreeSet.lower(number));
            System.out.println("Closest bigger number is " + numbersTreeSet.higher(number));
        }
        else
            System.out.println("Number " + number + " is not present in the set.");
    }


}
