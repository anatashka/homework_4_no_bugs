package practice_6_collections.b_linkedList_tasks;

import java.util.ListIterator;
import java.util.LinkedList;

public class Task_b5 {
    public void goThroughTheList(){
        LinkedList<String> listOfCars = new LinkedList<>();
        listOfCars.add("Tesla");
        listOfCars.add("BMW");
        listOfCars.add("Ford");
        listOfCars.add("Mazda");
        listOfCars.add("Toyota");

        ListIterator<String> it = listOfCars.listIterator();
        System.out.println("Go through the list FORWARD:");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Go through the list BACKWARD:");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
