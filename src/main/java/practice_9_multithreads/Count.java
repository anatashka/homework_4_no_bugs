package practice_9_multithreads;

public class Count {
    private int counter = 0;
    public synchronized void increment() {
        counter++;
    }

    public int getCount() {
        return counter;
    }
}
