package practice_6_collections.a_tasks_from_practika.user_monitor_HashSet;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");
        userMonitor.addNewSession("99999");

        userMonitor.printSessions();
    }
}
