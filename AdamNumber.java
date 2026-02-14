import java.util.Scanner;

public class AdamNumber {

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static boolean isAdam(int n) {
        // n^2
        int squareN = n * n;
        // reverse of n
        int revN = reverse(n);
        // (reverse of n)^2
        int squareRevN = revN * revN;
        // reverse of (reverse of n)^2
        int revSquareRevN = reverse(squareRevN);

        return squareN == revSquareRevN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Adam Number Checker ===");
        System.out.println(
                "A number is Adam if the square of the number and the square of its reverse are reverse of each other.");
        System.out.println("Example: 12 (12^2 = 144, rev(12)=21, 21^2 = 441, rev(441)=144)\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isAdam(n)) {
            System.out.println("\n" + n + " is an ADAM number!");
        } else {
            System.out.println("\n" + n + " is NOT an Adam number.");
        }

        scanner.close();
    }
}
