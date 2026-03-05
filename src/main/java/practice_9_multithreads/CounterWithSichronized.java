package practice_9_multithreads;

// Напишите класс Counter с методом increment, увеличивающим значение счётчика.
// Создайте два потока, каждый из которых вызывает increment() 1000 раз.
// Обеспечьте правильную работу с помощью synchronized.

import java.util.concurrent.atomic.AtomicInteger;

public class CounterWithSichronized {

    public static void main(String[] args) throws InterruptedException{
        Count count = new Count();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i<1000; i++) {
               count.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i<1000; i++) {
                count.increment();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Counter = " + count.getCount());
    }
}
