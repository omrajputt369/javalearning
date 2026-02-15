import java.util.*;

/**
 * A basic Inventory System to track stock levels of various products.
 */
class Product {
    String name;
    int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Quantity: " + quantity;
    }
}

public class InventorySystem {
    private static Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. View Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial quantity: ");
                    int qty = scanner.nextInt();
                    inventory.put(name, new Product(name, qty));
                    System.out.println("Product added.");
                    break;
                case 2:
                    System.out.print("Enter product name to update: ");
                    String updateName = scanner.nextLine();
                    if (inventory.containsKey(updateName)) {
                        System.out.print("Enter new quantity: ");
                        int newQty = scanner.nextInt();
                        inventory.get(updateName).quantity = newQty;
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("\nCurrent Inventory:");
                        for (Product p : inventory.values()) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
