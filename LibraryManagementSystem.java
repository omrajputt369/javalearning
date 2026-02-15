import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple Library Management System to add, view, and search for books.
 */
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    library.add(new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    if (library.isEmpty()) {
                        System.out.println("Library is empty.");
                    } else {
                        System.out.println("\nAll Books:");
                        for (Book book : library) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : library) {
                        if (book.title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Found: " + book);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book not found.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
