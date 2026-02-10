import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is divisible by 4 AND not divisible by 100
        // OR
        // 2. It is divisible by 400

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find all leap years in a range
    public static void findLeapYearsInRange(int start, int end) {
        System.out.println("Leap years between " + start + " and " + end + ":");
        int count = 0;

        for (int year = start; year <= end; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        if (count == 0) {
            System.out.println("None found");
        } else {
            System.out.println("\nTotal: " + count + " leap years");
        }
    }

    // Method to find next N leap years from a given year
    public static void findNextLeapYears(int startYear, int n) {
        System.out.println("Next " + n + " leap years from " + startYear + ":");
        int count = 0;
        int year = startYear;

        while (count < n) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            year++;
        }
        System.out.println();
    }

    // Method to get days in a month considering leap year
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to calculate age considering leap years
    public static void calculateAge(int birthYear, int currentYear) {
        int age = currentYear - birthYear;
        int leapYears = 0;

        for (int year = birthYear; year < currentYear; year++) {
            if (isLeapYear(year)) {
                leapYears++;
            }
        }

        System.out.println("Age: " + age + " years");
        System.out.println("Leap years in your lifetime: " + leapYears);
        System.out.println("Extra days due to leap years: " + leapYears);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Leap Year Checker ===");
        System.out.println("1. Check if a year is a leap year");
        System.out.println("2. Find leap years in a range");
        System.out.println("3. Find next N leap years");
        System.out.println("4. Get days in a month");
        System.out.println("5. Calculate age with leap years");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if (isLeapYear(year)) {
                    System.out.println(year + " is a LEAP YEAR!");
                    System.out.println("February has 29 days in " + year);
                } else {
                    System.out.println(year + " is NOT a leap year.");
                    System.out.println("February has 28 days in " + year);
                }
                break;

            case 2:
                System.out.print("Enter start year: ");
                int start = scanner.nextInt();
                System.out.print("Enter end year: ");
                int end = scanner.nextInt();

                if (start > end) {
                    System.out.println("Start year must be less than or equal to end year!");
                } else {
                    findLeapYearsInRange(start, end);
                }
                break;

            case 3:
                System.out.print("Enter starting year: ");
                int startYear = scanner.nextInt();
                System.out.print("How many leap years to find? ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number!");
                } else {
                    findNextLeapYears(startYear, n);
                }
                break;

            case 4:
                System.out.print("Enter month (1-12): ");
                int month = scanner.nextInt();
                System.out.print("Enter year: ");
                int yr = scanner.nextInt();

                int days = getDaysInMonth(month, yr);

                if (days == -1) {
                    System.out.println("Invalid month!");
                } else {
                    String[] monthNames = { "January", "February", "March", "April",
                            "May", "June", "July", "August",
                            "September", "October", "November", "December" };
                    System.out.println(monthNames[month - 1] + " " + yr + " has " + days + " days");

                    if (month == 2) {
                        if (isLeapYear(yr)) {
                            System.out.println("(" + yr + " is a leap year, so February has 29 days)");
                        } else {
                            System.out.println("(" + yr + " is not a leap year, so February has 28 days)");
                        }
                    }
                }
                break;

            case 5:
                System.out.print("Enter birth year: ");
                int birthYear = scanner.nextInt();
                System.out.print("Enter current year: ");
                int currentYear = scanner.nextInt();

                if (birthYear > currentYear) {
                    System.out.println("Birth year cannot be greater than current year!");
                } else {
                    calculateAge(birthYear, currentYear);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
