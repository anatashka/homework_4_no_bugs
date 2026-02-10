package practice_6_collections.d_LinkedHashMap_tasks;

import java.util.LinkedHashMap;

public class Task_d23 {
    LinkedHashMap<String,String> viewsHistory = new LinkedHashMap<>();

    public void addView(String page_id, String page_name){
        if (viewsHistory.size()<10) viewsHistory.put(page_id,page_name);
        else {
            viewsHistory.pollFirstEntry();
            viewsHistory.put(page_id,page_name);
        }
    }

    public void printHistory(){
        System.out.println(viewsHistory);
    }
}
