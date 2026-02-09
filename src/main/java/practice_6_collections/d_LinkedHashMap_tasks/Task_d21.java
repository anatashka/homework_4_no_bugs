package practice_6_collections.d_LinkedHashMap_tasks;

import java.util.LinkedHashMap;

public class Task_d21 {
    LinkedHashMap<String,String> capitals = new LinkedHashMap<>();

    public void createCapitals(){
        capitals.put("Armenia", "Yerevan");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("Estonia", "Tallin");
    }

    public void printList(){
        System.out.println("List in the order it was inserted:");
        for (String country : capitals.keySet()){
            System.out.println("Country: " + country + " it's capital: " + capitals.get(country));
        }
    }

}
