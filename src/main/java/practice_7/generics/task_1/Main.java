package practice_7.generics.task_1;
/*
1. Задача на дженерик класс
Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
 */

public class Main {
    public static void main(String[] args) {
        // Box for String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String: " + stringBox.get());

        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer: " + intBox.get());

        // Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println("Double: " + doubleBox.get());

        // Box for custom object
        Box<Person> personBox = new Box<>();
        personBox.set(new Person("Alice", 25));
        System.out.println("Person: " + personBox.get().getName() + " age: " + personBox.get().getAge());
    }

}
