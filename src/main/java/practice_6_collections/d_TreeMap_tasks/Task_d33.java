package practice_6_collections.d_TreeMap_tasks;

import java.util.TreeMap;

public class Task_d33 {
    TreeMap<Integer,String> employee = new TreeMap<>();

    public void createEmployee(){
        employee.put(100, "Chris");
        employee.put(200, "Kate");
        employee.put(300, "Ann");
        employee.put(400, "Jake");
        employee.put(500, "Jane");
        employee.put(600, "Bill");
        employee.put(700, "Jim");
        System.out.println(employee);
    }

    public void searchHigherID(Integer id){
        if (employee.higherKey(id)==null) System.out.println("There is no employee with id higher than " + id);
        else System.out.println("You search for id higher than " + id + " it is " + employee.higherEntry(id));
    }
}
