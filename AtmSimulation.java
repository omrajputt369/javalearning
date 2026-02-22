import java.util.Scanner;

/**
 * Simulates an interactive ATM terminal session.
 */
public class AtmSimulation {
    private String pin = "1234";
    private SavingsAccount currentAccount;
    private Scanner scanner = new Scanner(System.in);

    public AtmSimulation(SavingsAccount account) {
        this.currentAccount = account;
    }

    public boolean login() {
        System.out.println("--- Welcome to the ATM ---");
        System.out.print("Enter your 4-digit PIN: ");
        String enteredPin = scanner.nextLine();
        return pin.equals(enteredPin);
    }

    public void start() {
        if (!login()) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n[ATM MENU]");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Current Balance: $" + currentAccount.getBalance());
                    break;
                case "2":
                    System.out.print("Enter deposit amount: ");
                    double dep = Double.parseDouble(scanner.nextLine());
                    currentAccount.deposit(dep);
                    break;
                case "3":
                    System.out.print("Enter withdrawal amount: ");
                    double with = Double.parseDouble(scanner.nextLine());
                    currentAccount.withdraw(with);
                    break;
                case "4":
                    System.out.println("Thank you for using our ATM!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        // Create a mock account for the simulation
        SavingsAccount mockAcc = new SavingsAccount("ATM-TEST", 5000.0, 4.0);
        AtmSimulation atm = new AtmSimulation(mockAcc);

        // Note: For automated git push, we won't run the interactive parts in main.
        // But the class is ready for interaction.
        System.out.println("[SIMULATION] Initializing ATM session...");
        System.out.println("[SIMULATION] (Main method can be used for interactive testing)");
    }
}
