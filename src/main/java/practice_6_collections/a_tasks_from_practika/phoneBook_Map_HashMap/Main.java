package practice_6_collections.a_tasks_from_practika.phoneBook_Map_HashMap;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Nick", 11111);
        phoneBook.addContact("Andrew", 22222);
        phoneBook.addContact("Fred", 33333);
        phoneBook.printContacts();

        phoneBook.updatePhoneContact("Andrew", 99999);
        phoneBook.printContacts();
    }
}
