import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImpl {

    private Node head;

    public LinkedListImpl() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at beginning");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted " + data + " at end");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted " + data);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Deleted " + data);
        } else {
            System.out.println(data + " not found!");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }

    public void search(int data) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println(data + " found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println(data + " not found!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListImpl list = new LinkedListImpl();
        boolean running = true;

        System.out.println("=== Singly Linked List ===");

        while (running) {
            System.out.println("\n1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val1 = scanner.nextInt();
                    list.insertAtBeginning(val1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int val2 = scanner.nextInt();
                    list.insertAtEnd(val2);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    int val3 = scanner.nextInt();
                    list.delete(val3);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    int val5 = scanner.nextInt();
                    list.search(val5);
                    break;

                case 6:
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
