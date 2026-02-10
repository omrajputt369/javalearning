import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCI(double principal, double rate, double time, int n) {
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Interest Calculator ===");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (years): ");
        double time = scanner.nextDouble();

        if (choice == 1) {
            double si = calculateSI(principal, rate, time);
            double total = principal + si;

            System.out.println("\n=== Simple Interest ===");
            System.out.printf("Principal: %.2f\n", principal);
            System.out.printf("Rate: %.2f%%\n", rate);
            System.out.printf("Time: %.2f years\n", time);
            System.out.printf("Interest: %.2f\n", si);
            System.out.printf("Total Amount: %.2f\n", total);

        } else if (choice == 2) {
            System.out.print("Compounding frequency (1=Annually, 2=Semi-annually, 4=Quarterly, 12=Monthly): ");
            int n = scanner.nextInt();

            double ci = calculateCI(principal, rate, time, n);
            double total = principal + ci;

            System.out.println("\n=== Compound Interest ===");
            System.out.printf("Principal: %.2f\n", principal);
            System.out.printf("Rate: %.2f%%\n", rate);
            System.out.printf("Time: %.2f years\n", time);
            System.out.printf("Compounding: %d times/year\n", n);
            System.out.printf("Interest: %.2f\n", ci);
            System.out.printf("Total Amount: %.2f\n", total);

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
