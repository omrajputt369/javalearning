import java.util.Scanner;

class ScientificCalculator {

    // Factorial (only for non-negative integers)
    static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        long ans = 1;
        for (int i = 2; i <= n; i++)
            ans *= i;
        return ans;
    }

    static void menu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1) Add (+)");
        System.out.println("2) Subtract (-)");
        System.out.println("3) Multiply (*)");
        System.out.println("4) Divide (/)");
        System.out.println("5) Modulus (%)");
        System.out.println("6) Power (a^b)");
        System.out.println("7) Square root (sqrt)");
        System.out.println("8) Sin (degrees)");
        System.out.println("9) Cos (degrees)");
        System.out.println("10) Tan (degrees)");
        System.out.println("11) log10(x)");
        System.out.println("12) ln(x)");
        System.out.println("13) abs(x)");
        System.out.println("14) factorial(n)");
        System.out.println("15) Constants (pi, e)");
        System.out.println("0) Exit");
        System.out.print("Choose: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid choice.");
                continue;
            }

            try {
                if (ch == 0) {
                    System.out.println("Bye!");
                    break;
                }

                switch (ch) {
                    case 1: {
                        System.out.print("Enter a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        System.out.println("Result = " + (a + b));
                        break;
                    }
                    case 2: {
                        System.out.print("Enter a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        System.out.println("Result = " + (a - b));
                        break;
                    }
                    case 3: {
                        System.out.print("Enter a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        System.out.println("Result = " + (a * b));
                        break;
                    }
                    case 4: {
                        System.out.print("Enter a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        if (b == 0) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result = " + (a / b));
                        }
                        break;
                    }
                    case 5: {
                        System.out.print("Enter a (integer): ");
                        long a = Long.parseLong(sc.nextLine());
                        System.out.print("Enter b (integer): ");
                        long b = Long.parseLong(sc.nextLine());
                        if (b == 0) {
                            System.out.println("Cannot mod by zero.");
                        } else {
                            System.out.println("Result = " + (a % b));
                        }
                        break;
                    }
                    case 6: {
                        System.out.print("Enter base a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter power b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        System.out.println("Result = " + Math.pow(a, b));
                        break;
                    }
                    case 7: {
                        System.out.print("Enter x: ");
                        double x = Double.parseDouble(sc.nextLine());
                        if (x < 0)
                            System.out.println("sqrt not defined for negative in real numbers.");
                        else
                            System.out.println("Result = " + Math.sqrt(x));
                        break;
                    }
                    case 8: {
                        System.out.print("Enter angle (degrees): ");
                        double deg = Double.parseDouble(sc.nextLine());
                        double rad = Math.toRadians(deg);
                        System.out.println("Result = " + Math.sin(rad));
                        break;
                    }
                    case 9: {
                        System.out.print("Enter angle (degrees): ");
                        double deg = Double.parseDouble(sc.nextLine());
                        double rad = Math.toRadians(deg);
                        System.out.println("Result = " + Math.cos(rad));
                        break;
                    }
                    case 10: {
                        System.out.print("Enter angle (degrees): ");
                        double deg = Double.parseDouble(sc.nextLine());
                        double rad = Math.toRadians(deg);
                        System.out.println("Result = " + Math.tan(rad));
                        break;
                    }
                    case 11: {
                        System.out.print("Enter x: ");
                        double x = Double.parseDouble(sc.nextLine());
                        if (x <= 0)
                            System.out.println("log10 is defined for x > 0 only.");
                        else
                            System.out.println("Result = " + Math.log10(x));
                        break;
                    }
                    case 12: {
                        System.out.print("Enter x: ");
                        double x = Double.parseDouble(sc.nextLine());
                        if (x <= 0)
                            System.out.println("ln is defined for x > 0 only.");
                        else
                            System.out.println("Result = " + Math.log(x));
                        break;
                    }
                    case 13: {
                        System.out.print("Enter x: ");
                        double x = Double.parseDouble(sc.nextLine());
                        System.out.println("Result = " + Math.abs(x));
                        break;
                    }
                    case 14: {
                        System.out.print("Enter n (0 or positive integer): ");
                        int n = Integer.parseInt(sc.nextLine());
                        System.out.println("Result = " + factorial(n));
                        break;
                    }
                    case 15: {
                        System.out.println("pi = " + Math.PI);
                        System.out.println("e  = " + Math.E);
                        break;
                    }
                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        sc.close();
    }
}