package practice_6_collections.c_hashSet_tasks;

import java.util.HashSet;

public class Task_c12 {
    private HashSet<Integer> numbersHashset = new HashSet<>();

    public void createHashSet(Integer number){
        for (int i = 0; i<11; i++){
            numbersHashset.add(i*number);
        }
        System.out.println(numbersHashset);
    }

    public boolean checkIfContainsNumber(Integer number){
        return numbersHashset.contains(number);
    }

}
