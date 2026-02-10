package practice_6_collections.z_tasks;

import java.util.HashMap;

public class Task_3_Settings {
    HashMap<String,String> settings = new HashMap<>();

    public void addSetting(String name, String value){
        if (settings.containsKey(name)) System.out.println("Setting (" + name + ") is already present");
        else
            settings.put(name,value);
    }

    public void settingValue(String name){
        if (settings.containsKey(name)) System.out.println("Setting's (" + name + ") value = " + settings.get(name));
        else
            System.out.println("Setting (" + name + ") is NOT present");
    }
}
