package practice_6_collections.d_LinkedHashMap_tasks;

public class Main {
    public static void main(String[] args) {
        Task_d23 task_d = new Task_d23();
        task_d.addView("0000", "aaa");
        task_d.addView("1111", "bbb");
        task_d.addView("2222", "ccc");
        task_d.addView("3333", "ddd");
        task_d.addView("4444", "eee");
        task_d.addView("5555", "fff");
        task_d.addView("6666", "ggg");
        task_d.addView("7777", "hhh");
        task_d.addView("8888", "iii");
        task_d.addView("9999", "jjj");

        task_d.printHistory();

        task_d.addView("101010", "abc");
        task_d.printHistory();
        task_d.addView("111111", "def");
        task_d.printHistory();

        /*Task_d22 task_d = new Task_d22();
        task_d.createPhoneBook();
        task_d.printList();
        task_d.addContact("Ben", "9999999");
        task_d.addContact("Hope","777777");
        task_d.printList();
        task_d.searchContact("Ben");
        task_d.searchContact("Bau"); */

        /*Task_d21 task_d = new Task_d21();
        task_d.createCapitals();
        task_d.printList();*/
    }
}
