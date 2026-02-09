package practice_6_collections.c_hashSet_tasks;

import java.util.HashSet;

public class Task_c11 {
    public void showHashset(){
        HashSet<Integer> numbersHashset = new HashSet<>();

        for (int i = 0; i<5; i++){
            numbersHashset.add(i*5);
        }
        System.out.println(numbersHashset);
    }

}
