/**
 * A Java program demonstrating the Singleton Design Pattern.
 */

class Singleton {
    // Private static instance of the same class that is the only instance of the
    // class.
    private static Singleton instance;

    // Private constructor to restrict instantiation of the class from other
    // classes.
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Public static method that returns the instance of the class, this is the
    // global access point for outer world to get the instance of the singleton
    // class.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Illegal construct
        // Singleton object = new Singleton();

        // Get the only object available
        Singleton object1 = Singleton.getInstance();
        object1.showMessage();

        Singleton object2 = Singleton.getInstance();

        System.out.println("Are both instances same? " + (object1 == object2));
    }
}
