package practice_6_collections.a_tasks_from_practika.cost_counter_ArrayList;

import java.util.ArrayList;

public class CostCounter {
    // array, where i - is number of month
    ArrayList<Double> costsPerMonth = new ArrayList<>();

    public void addCosts(Double costs){
        costsPerMonth.add(costs);
    }

    // need method to get the expenses per month
    public Double getCosts(int month){
        return costsPerMonth.get(month-1);
    }
    // find the least money spent
    public Double minCostsPerMonth() {
        Double min = costsPerMonth.getFirst();
        for (int i = 1; i <= costsPerMonth.size(); i++){
            System.out.println(i + " : $" + costsPerMonth.get(i-1));
        }
        for (int i = 1; i < costsPerMonth.size(); i++){
            if (costsPerMonth.get(i) < min){
                min = costsPerMonth.get(i);
            }
        }
        return min;
    }
}
