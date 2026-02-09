package practice_6_collections.a_tasks_from_practika.phoneBook_Map_HashMap;

import java.util.HashMap;

public class PhoneBook {
    // key - value
    private HashMap<String, Integer> contacts;

    // define
    public PhoneBook(){
        this.contacts = new HashMap<>();
    }

    // add contact
    public void addContact(String name, Integer phone){
        contacts.put(name, phone);
    }

    // search by name
    public Integer getPhone(String name){
        return contacts.get(name);
    }
    // update phone number by name
    public void updatePhoneContact(String name, Integer updatedPhone){
        contacts.put(name, updatedPhone);
    }

    public  void printContacts(){
        System.out.println("All contacts: " + contacts);
    }
}
