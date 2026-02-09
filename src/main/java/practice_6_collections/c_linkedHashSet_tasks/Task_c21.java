package practice_6_collections.c_linkedHashSet_tasks;

import java.util.LinkedHashSet;

public class Task_c21 {
    private LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

    public void createLinkedHashSet(){
        stringLinkedHashSet.add("apple");
        stringLinkedHashSet.add("banana");
        stringLinkedHashSet.add("avocado");
        stringLinkedHashSet.add("coconut");
        stringLinkedHashSet.add("grapes");
        stringLinkedHashSet.add("strawberry");
        stringLinkedHashSet.add("cherry");
        System.out.println(stringLinkedHashSet);
    }
}
