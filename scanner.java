
// JAVA program to demonstrate Working of Scanner class 
import java.util.Scanner;

class scanner {
    public static void main(String args[]) {

        // Using Scanner for getting input from user
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = s.nextLine();
        System.out.println("You entered String: " + s1);

        System.out.println("Enter an integer: ");
        int a = s.nextInt();
        System.out.println("You entered integer: " + a);

        System.out.println("Enter a float: ");
        float b = s.nextFloat();
        System.out.println("You entered float: " + b);

        s.close(); // Close the scanner
    }
}
