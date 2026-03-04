package practice_7_exceptions_generics.generics.task_3;
/*
3. Задача на дженерик с двумя типами данных
Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
Класс должен позволять получать и устанавливать каждый из этих объектов.
 */

public class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Setters
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
