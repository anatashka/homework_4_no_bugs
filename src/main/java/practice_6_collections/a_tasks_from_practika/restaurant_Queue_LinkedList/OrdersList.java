package practice_6_collections.a_tasks_from_practika.restaurant_Queue_LinkedList;

import java.util.LinkedList;

public class OrdersList {
    /*
        orders are done in the order they arrived => added to the end; executed from the beginning
        orders can be deleted from any place => queue
     */
    private LinkedList<String> orders;

    public OrdersList(){
        this.orders = new LinkedList<>();
    }

    // added to the end
    public void addOrder(String order){
        orders.addLast(order);
    }

    // executed from the beginning
    public String executeOrder(){
        return orders.poll();
    }

    //deleted from any place
    public void deleteOrder(String order){
        orders.remove(order);
    }

    public void printOrders(){
        System.out.println("All orders:" + orders);
        /*for (int i = 0; i< this.orders.size(); i++) {
            System.out.println(this.orders.element());
        }*/

    }
}
