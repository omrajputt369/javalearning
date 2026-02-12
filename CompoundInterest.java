import java.util.Scanner;

public class CompoundInterest {

    public static double calculateCompoundInterest(double principal, double rate, int time, int n) {
        // A = P(1 + r/n)^(nt)
        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        return amount - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Compound Interest Calculator ===");

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        int time = scanner.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double interest = calculateCompoundInterest(principal, rate, time, n);
        double totalAmount = principal + interest;

        System.out.printf("\nCompound Interest: %.2f\n", interest);
        System.out.printf("Total Amount: %.2f\n", totalAmount);

        scanner.close();
    }
}
