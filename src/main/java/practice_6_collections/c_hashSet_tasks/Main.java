package practice_6_collections.c_hashSet_tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task_c14 task_c = new Task_c14();
        task_c.createNamesHashset(15);
        task_c.checkName("Kate");
        task_c.checkName("Nata");
        task_c.checkName("mei");

        /*Task_c13 task_c = new Task_c13();
        List<String> listOfCars = new ArrayList<>();
        listOfCars.add("Toyota");
        listOfCars.add("Toyota");
        listOfCars.add("Tesla");
        listOfCars.add("BMW");
        listOfCars.add("Tesla");

        System.out.println(listOfCars);
        System.out.println(task_c.convertListToSet(listOfCars));*/

        /*Task_c12 task_c = new Task_c12();
        Integer numberToCheck = 14;

        task_c.createHashSet(5);
        System.out.println("HashSet contains number " + numberToCheck + ": " + task_c.checkIfContainsNumber(numberToCheck));*/
    }
}
