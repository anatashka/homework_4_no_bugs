package practice_6_collections.d_HashMap_tasks;

import java.util.HashMap;

public class Task_d13 {
    HashMap<String,Integer> nameAge = new HashMap<>();

    public void createNameAge() {
        nameAge.put("Nata", 15);
        nameAge.put("Nick", 40);
        nameAge.put("Varvi", 14);
        nameAge.put("Andrew", 8);
        nameAge.put("Freddie", 3);

        System.out.println(nameAge);
    }

    public void printUnder18(){
        System.out.println("People under 18: ");
        for (String name : nameAge.keySet()){
            if (nameAge.get(name) < 18) {
                System.out.println(name);
            }
        }

    }
}
