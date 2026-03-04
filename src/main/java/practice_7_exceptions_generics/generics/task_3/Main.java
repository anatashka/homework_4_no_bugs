package practice_7_exceptions_generics.generics.task_3;

public class Main {
    public static void main(String[] args) {
        // Pair of String and Integer
        Pair<String, Integer> person = new Pair<>("Alice", 25);
        System.out.println("Name: " + person.getFirst());
        System.out.println("Age: " + person.getSecond());
        System.out.println(person);

        // Pair of Integer and String
        Pair<Integer, String> idName = new Pair<>(101, "Bob");
        System.out.println("ID: " + idName.getFirst());
        System.out.println("Name: " + idName.getSecond());

        // Pair of Double and Boolean
        Pair<Double, Boolean> priceAvailable = new Pair<>(99.99, true);
        System.out.println("Price: $" + priceAvailable.getFirst());
        System.out.println("Available: " + priceAvailable.getSecond());

        // Change values
        person.setFirst("Alice Smith");
        person.setSecond(26);
        System.out.println("\nUpdated: " + person);
    }
}
