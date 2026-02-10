package practice_6_collections.z_tasks;

import java.util.HashSet;

public class Task_4_unique_pages {
    HashSet<String> page = new HashSet<>();
    Integer totalPagesLoaded = 0;

    public void openPage(String page_id){
        page.add(page_id);
        totalPagesLoaded++;
    }
}
