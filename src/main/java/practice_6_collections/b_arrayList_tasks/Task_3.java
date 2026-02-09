package practice_6_collections.b_arrayList_tasks;

import java.util.ArrayList;

public class Task_3 {
    public void longestStringFromArray(){
        ArrayList<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("Actions speak louder than words.");
        listOfStrings.add("Better late than never.");
        listOfStrings.add("Don't judge a book by its cover.");
        listOfStrings.add("The early bird catches the worm.");
        listOfStrings.add("Better safe than sorry.");
        listOfStrings.add("The only true wisdom is in knowing you know nothing");
        listOfStrings.add("Practice makes perfect.");
        listOfStrings.add("Where there's a will, there's a way.");
        listOfStrings.add("Yesterday is history, tomorrow is a mystery, today is a gift of God, which is why we call it the present");


        String maxString = listOfStrings.getFirst();
        for (int i = 1; i< listOfStrings.size(); i++) {
            if (maxString.length() < listOfStrings.get(i).length()) maxString = listOfStrings.get(i);
        }
        System.out.println(maxString);
    }
}
