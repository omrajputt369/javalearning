import java.util.Scanner;

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    private DNode head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        System.out.println("Inserted " + data + " at beginning");
    }

    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
        } else {
            DNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
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
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Deleted " + data);
            return;
        }

        DNode temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            System.out.println("Deleted " + data);
        } else {
            System.out.println(data + " not found!");
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Forward: NULL ");
        DNode temp = head;
        while (temp != null) {
            System.out.print("<-> " + temp.data + " ");
            temp = temp.next;
        }
        System.out.println("<-> NULL");
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: NULL ");
        while (temp != null) {
            System.out.print("<-> " + temp.data + " ");
            temp = temp.prev;
        }
        System.out.println("<-> NULL");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        boolean running = true;

        System.out.println("=== Doubly Linked List ===");

        while (running) {
            System.out.println("\n1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete");
            System.out.println("4. Display forward");
            System.out.println("5. Display backward");
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
                    list.displayForward();
                    break;

                case 5:
                    list.displayBackward();
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
