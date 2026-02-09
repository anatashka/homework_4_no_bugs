package practice_6_collections.d_LinkedHashMap_tasks;

import java.util.LinkedHashMap;

public class Task_d22 {
    LinkedHashMap<String,String> phoneBook = new LinkedHashMap<>();

    public void createPhoneBook(){
        phoneBook.put("Anya", "111111111");
        phoneBook.put("Boris", "222222222");
        phoneBook.put("Zina", "3333");
        phoneBook.put("Katya", "4444444");
        phoneBook.put("Vova", "555555555");
    }

    public void printList(){
        System.out.println("PhoneBook:");
        for (String name : phoneBook.keySet()){
            System.out.println(name + " - " + phoneBook.get(name));
        }
    }

    public void addContact(String name, String phoneNumber){
        phoneBook.put(name, phoneNumber);
    }

    public void searchContact(String name){
        if (phoneBook.containsKey(name)) System.out.println(name + "'s phone number is " + phoneBook.get(name));
        else System.out.println("Contact " + name + " is not found in the phone book.");
    }
}
