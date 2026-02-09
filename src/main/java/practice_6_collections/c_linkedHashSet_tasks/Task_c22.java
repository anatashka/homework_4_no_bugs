package practice_6_collections.c_linkedHashSet_tasks;

import java.util.LinkedHashSet;

public class Task_c22 {
    private LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

    public void createLinkedHashSet(){
        stringLinkedHashSet.add("apple");
        stringLinkedHashSet.add("banana");
        stringLinkedHashSet.add("avocado");
        stringLinkedHashSet.add("coconut");
        stringLinkedHashSet.add("grapes");
        stringLinkedHashSet.add("strawberry");
        stringLinkedHashSet.add("cherry");
    }

    public void addIfNotDuplicate(String name){
        if (!stringLinkedHashSet.contains(name)){
            stringLinkedHashSet.add(name);
            System.out.println("Element (" + name + ") was added.");
        }
        else
            System.out.println("Element (" + name + ") was not added as it is already present.");
    }

    public void printSet(){
        System.out.println(stringLinkedHashSet);
    }
}
