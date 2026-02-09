package practice_6_collections.b_linkedList_tasks;

import java.util.LinkedList;

public class Task_b3 {
    public void createLinkedListAndPrintFirstAndLast() {
        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("Why don't scientists trust atoms? Because they make up everything.");
        linkedList.add("I'm reading a book about anti-gravity, and it's impossible to put down.");
        linkedList.add("What do you call a fake noodle? An impasta.");
        linkedList.add("I used to be addicted to the Hokey Pokey, but then I turned myself around.");
        linkedList.add("What’s the best thing about Switzerland? I don’t know, but the flag is a big plus.");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
