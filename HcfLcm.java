import java.util.Scanner;

public class HcfLcm {

    public static int findHCF(int a, int b) {
        if (b == 0)
            return a;
        return findHCF(b, a % b);
    }

    public static int findLCM(int a, int b) {
        // LCM * HCF = a * b
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== HCF and LCM Calculator ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive integers!");
        } else {
            int hcf = findHCF(a, b);
            int lcm = findLCM(a, b);

            System.out.println("\nResults for " + a + " and " + b + ":");
            System.out.println("HCF (GCD): " + hcf);
            System.out.println("LCM:       " + lcm);
        }

        scanner.close();
    }
}
