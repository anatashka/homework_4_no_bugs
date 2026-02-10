package practice_6_collections.z_tasks;

import java.util.HashMap;

public class Task_6_phoneBook {
    HashMap<String,String> phoneBook = new HashMap<>();

    public void addContact (String name, String phoneNumber){
        if (phoneBook.containsKey(name)) System.out.println("Contact " + name + " is already entered.");
        else {
            phoneBook.put(name,phoneNumber);
            System.out.println("Contact " + name + " with phonenumber " + phoneNumber + " is added.");
        }
    }

    public void searchPhoneNumber(String name){
        if (phoneBook.containsKey(name)) System.out.println("Contact's " + name + " phone number is " + phoneBook.get(name));
        else {
            System.out.println("Contact " + name + " is not found");
        }
    }
}
