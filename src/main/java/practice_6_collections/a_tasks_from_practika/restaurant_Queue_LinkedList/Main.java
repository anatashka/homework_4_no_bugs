package practice_6_collections.a_tasks_from_practika.restaurant_Queue_LinkedList;

public class Main {
    public static void main(String[] args) {
        OrdersList fridayList = new OrdersList();

        fridayList.addOrder("ice-cream");
        fridayList.addOrder("tea");
        fridayList.addOrder("coffee");
        fridayList.addOrder("brisket");
        fridayList.printOrders();

        fridayList.executeOrder();
        fridayList.printOrders(); // => ice-cream removed

        fridayList.addOrder("chicken soup"); // => added to the emd of the list
        fridayList.printOrders();

        fridayList.deleteOrder("brisket");
        fridayList.printOrders();


    }
}
