package practice_7_exceptions_generics.generics.task_2;
/*
2. Задача на дженерик метод
Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
 */

public class PrintArray_Task {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println(); // Empty line after array
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        // String array
        String[] stringArray = {"Hello", "World", "Java"};
        printArray(stringArray);

        // Double array
        Double[] doubleArray = {1.5, 2.7, 3.14, 4.8};
        printArray(doubleArray);
    }
}
