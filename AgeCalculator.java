import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void calculateAge(int day, int month, int year) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) {
            System.out.println("Birth date cannot be in the future!");
            return;
        }

        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Total days
        long totalDays = birthDate.until(currentDate).getDays();

        // Calculate weeks
        long weeks = totalDays / 7;

        // Calculate total months
        long totalMonths = years * 12L + months;

        System.out.println("\n=== Age Calculation ===");
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("\nYour Age:");
        System.out.println("  " + years + " years, " + months + " months, " + days + " days");
        System.out.println("\nAlternative Representations:");
        System.out.println("  Total months: " + totalMonths);
        System.out.println("  Total weeks: " + weeks);
        System.out.println("  Total days: " + totalDays);

        // Next birthday
        LocalDate nextBirthday = birthDate.withYear(currentDate.getYear());
        if (nextBirthday.isBefore(currentDate) || nextBirthday.equals(currentDate)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysToNextBirthday = currentDate.until(nextBirthday).getDays();

        System.out.println("\nNext Birthday: " + nextBirthday);
        System.out.println("Days until next birthday: " + daysToNextBirthday);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Age Calculator ===");
        System.out.print("Enter birth day: ");
        int day = scanner.nextInt();
        System.out.print("Enter birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();

        calculateAge(day, month, year);

        scanner.close();
    }
}
