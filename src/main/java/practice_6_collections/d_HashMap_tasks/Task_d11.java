package practice_6_collections.d_HashMap_tasks;

import java.util.HashMap;

public class Task_d11 {
    HashMap<String,Integer> nameAge = new HashMap<>();

    public void createNameAge() {
        nameAge.put("Nata", 15);
        nameAge.put("Nick", 40);
        nameAge.put("Varvi", 14);
        nameAge.put("Andrew", 8);
        nameAge.put("Freddie", 3);

        System.out.println(nameAge);
    }
}
