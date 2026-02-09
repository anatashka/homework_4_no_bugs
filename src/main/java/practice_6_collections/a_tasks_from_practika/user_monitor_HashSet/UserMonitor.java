package practice_6_collections.a_tasks_from_practika.user_monitor_HashSet;

import java.util.HashSet;
// store unique users
public class UserMonitor {
    private HashSet<String> sessions;

    public UserMonitor(){
        this.sessions = new HashSet<>();
    }

    public void addNewSession(String newSession){
        sessions.add(newSession);
    }

    public HashSet<String> getSessions(){
        return this.sessions;
    }

    public void printSessions(){
        System.out.println("Unique sessions: " + sessions);
    }
}
