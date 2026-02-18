package practice_6_collections.a_tasks_from_practika.cost_counter_ArrayList;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();

        /*
        costCounter.addCosts(100.0);
        costCounter.addCosts(200.0);
        costCounter.addCosts(50.0);
        costCounter.addCosts(1000.0);
        costCounter.addCosts(500.0);
        costCounter.addCosts(999.0);
        costCounter.addCosts(45.0);
        costCounter.addCosts(50.0);
        costCounter.addCosts(1000.0);
        costCounter.addCosts(500.0);
        costCounter.addCosts(999.0);
        costCounter.addCosts(150.0);*/



        if (costCounter.costsPerMonth.isEmpty())
            System.out.println("WARNING: Costs are not entered, yet");
        else
            System.out.println("min = $" + costCounter.minCostsPerMonth());
    }
}
