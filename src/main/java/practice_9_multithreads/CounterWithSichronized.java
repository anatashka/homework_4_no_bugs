package practice_9_multithreads;

// Напишите класс Counter с методом increment, увеличивающим значение счётчика.
// Создайте два потока, каждый из которых вызывает increment() 1000 раз.
// Обеспечьте правильную работу с помощью synchronized.

import java.util.concurrent.atomic.AtomicInteger;

public class CounterWithSichronized {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i<1000; i++) {
                counter ++ ;
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i<1000; i++) {
                counter ++ ;
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Counter = " + counter);
    }
}
