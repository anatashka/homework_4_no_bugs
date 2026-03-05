package practice_9_multithreads;

import java.util.concurrent.atomic.AtomicInteger;

//Создайте поток, который бесконечно увеличивает счетчик.
// В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
public class Counter {
    volatile static boolean stop = false;
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        Thread thread = new Thread(() -> {
            while (!stop) {
                counter.incrementAndGet();
            }
            System.out.println("Counter = " + counter);
        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        stop = true;
        System.out.println("Flad stop = true");
    }
}
