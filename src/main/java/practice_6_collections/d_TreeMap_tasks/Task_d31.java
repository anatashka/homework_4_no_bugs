package practice_6_collections.d_TreeMap_tasks;

import java.util.TreeMap;

public class Task_d31 {
    TreeMap<String,Integer> grades = new TreeMap<>();

    public void createGradesTreeMap(){
        grades.put("Nata", 5);
        grades.put("Tata", 3);
        grades.put("Jiji", 4);
        grades.put("Bill", 4);
        grades.put("Sam", 9);
        System.out.println("Grades: " + grades);
    }

    public void printSorted(){
        System.out.println("List is sorted by name automatically:");
        for (String name : grades.keySet()){
            System.out.println(name + " - " + grades.get(name));
        }
    }
}
