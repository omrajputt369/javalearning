import java.util.Scanner;

public class StackImpl {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackImpl(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot

 pop");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped: " + value);
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack: [");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i]);
                if (i < top)
                    System.out.print(", ");
            }
            System.out.println("] <- TOP");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Stack Implementation ===");
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();

        StackImpl stack = new StackImpl(size);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Check Full");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    int topVal = stack.peek();
                    if (topVal != -1) {
                        System.out.println("Top element: " + topVal);
                    }
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;

                case 6:
                    System.out.println(stack.isFull() ? "Stack is full" : "Stack is not full");
                    break;

                case 7:
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
