package practice_6_collections.d_LinkedHashMap_tasks;

public class Main {
    public static void main(String[] args) {
        Task_d22 task_d = new Task_d22();
        task_d.createPhoneBook();
        task_d.printList();
        task_d.addContact("Ben", "9999999");
        task_d.addContact("Hope","777777");
        task_d.printList();
        task_d.searchContact("Ben");
        task_d.searchContact("Bau");

        /*Task_d21 task_d = new Task_d21();
        task_d.createCapitals();
        task_d.printList();*/
    }
}
