import java.util.PriorityQueue;

/**
 * A Java program demonstrating PriorityQueue for Task Scheduling.
 */

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    // High priority value means more urgent (Higher numeric value = higher
    // priority)
    // We reverse the natural order or handle it in compareTo
    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.add(new Task("Low priority task", 1));
        taskQueue.add(new Task("High priority task", 10));
        taskQueue.add(new Task("Medium priority task", 5));
        taskQueue.add(new Task("Urgent task", 20));

        System.out.println("Processing tasks in order of priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }
    }
}
