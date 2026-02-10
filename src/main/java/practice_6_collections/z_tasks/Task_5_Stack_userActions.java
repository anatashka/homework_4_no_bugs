package practice_6_collections.z_tasks;

import java.util.LinkedList;

public class Task_5_Stack_userActions {
    LinkedList<String> userActions = new LinkedList<>();

    public void addAction(String action){
        userActions.add(action);
        System.out.println(action + " - is added.");
    }

    public void repeatLastAction(){
        System.out.println("Repeat: " + userActions.getLast());
    }

    public void removeLastAction(){
        System.out.println("Remove last action: " + userActions.removeLast());
    }
}
