package practice_9_multithreads;
//
public class TwoThreads {
//Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i<5; i++) {
                    System.out.println("Привет из потока A! Iteration #" + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i<5; i++) {
                    System.out.println("Привет из потока B! Iteration #" + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            thread1.start();
            thread2.start();

        }
}
