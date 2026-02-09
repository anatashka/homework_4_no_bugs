package practice_6_collections.c_hashSet_tasks;

import java.util.HashSet;
import java.util.List;

public class Task_c13 {
    public HashSet convertListToSet(List<String> list){
        HashSet<String> set = new HashSet<>();

        for (String string : list){
            set.add(string);
        }
        return set;
    }
}
