package practice_9_multithreads;

//Напишите программу, в которой создается отдельный поток,
// выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
public class OneThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i<5; i++) {
                System.out.println("Привет из потока! Iteration #" + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
