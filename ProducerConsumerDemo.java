import java.util.LinkedList;

/**
 * A Java program demonstrating the Producer-Consumer problem using wait/notify.
 */

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced: " + value);
                buffer.add(value++);

                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    wait();
                }

                int value = buffer.removeFirst();
                System.out.println("Consumer consumed: " + value);

                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        final SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();

        // Let it run for 5 seconds then terminate (simulation)
        Thread.sleep(5000);
        System.out.println("Stopping simulation...");
        System.exit(0);
    }
}
