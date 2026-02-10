package practice_6_collections.z_tasks;

import java.util.HashSet;

public class Task_1_usetID {
    private HashSet userID = new HashSet();

    public void addUser(Integer id){
        if (userID.contains(id)) System.out.println("User with id = " + id + " is already present");
        else
            userID.add(id);
    }

    public void containsUser(Integer id){
        if (userID.contains(id)) System.out.println("User with id = " + id + " is present");
        else
            System.out.println("User with id = " + id + " is NOT present");
    }
}
