package practice_6_collections.c_hashSet_tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class Task_c14 {
    private HashSet<String> namesHashSet = new HashSet();
    private String[] namesList = {"Grace","Quinn","Kate","Joyce","May","Mei","Anne","Nick","Zayne","Finn","Fred","James","Rome","Kane","Elle","Rae","Jude","Sage","Nata"};

    public void createNamesHashset(Integer count){
        for (int i = 0; i<count; i++){
            namesHashSet.add(namesList[i].toLowerCase());
        }
        System.out.println(namesHashSet);
    }

    public void checkName(String name){
        if (namesHashSet.contains(name.toLowerCase()))
            System.out.println(name + " is present in the HashSet");
        else
            System.out.println(name + " is not present in the HashSet");
    }
}
