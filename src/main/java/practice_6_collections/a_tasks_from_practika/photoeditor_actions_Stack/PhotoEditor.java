package practice_6_collections.a_tasks_from_practika.photoeditor_actions_Stack;

import java.util.Stack;

public class PhotoEditor {
    private Stack<String> actions;

    public PhotoEditor(){
        this.actions = new Stack<>();
    }

    //add new action
    public void addNewAction(String action){
        actions.push(action);
    }

    //delete last action
    public void undoLastAction(){
        if (!actions.isEmpty())
            actions.pop();
    }

    public void printActions(){
        System.out.println("List of actions: " + actions);
    }
}
