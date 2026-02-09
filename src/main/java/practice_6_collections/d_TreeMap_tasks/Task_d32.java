package practice_6_collections.d_TreeMap_tasks;

import java.util.TreeMap;

public class Task_d32 {
    TreeMap<String,Integer> grades = new TreeMap<>();

    public void createGradesTreeMap(){
        grades.put("Nata", 5);
        grades.put("Tata", 3);
        grades.put("Jiji", 4);
        grades.put("Bill", 4);
        grades.put("Sam", 9);
        System.out.println("Grades: " + grades);
    }

    public void showMinMax(){
        System.out.println("Min: " + grades.firstEntry());
        System.out.println("Max: " + grades.lastEntry());
    }
}
