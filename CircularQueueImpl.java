import java.util.Scanner;

public class CircularQueueImpl {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public CircularQueueImpl(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            size++;
            System.out.println("Enqueued: " + value);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize;
            size--;
            System.out.println("De queued: " + value);
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Circular Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % maxSize;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
        System.out.println("Front index: " + front + ", Rear index: " + rear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circular Queue Implementation ===");
        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();

        CircularQueueImpl queue = new CircularQueueImpl(size);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    int frontVal = queue.peek();
                    if (frontVal != -1) {
                        System.out.println("Front element: " + frontVal);
                    }
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
