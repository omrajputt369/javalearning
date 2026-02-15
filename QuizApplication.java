import java.util.Scanner;

/**
 * A simple Quiz Application with multiple choice questions.
 */
public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[][] questions = {
                { "What is the default value of a boolean variable in Java?", "A. true", "B. false", "C. null", "D. 0",
                        "B" },
                { "Which keyword is used to inherit a class in Java?", "A. implements", "B. inherits", "C. extends",
                        "D. import", "C" },
                { "What is the size of an int variable in Java?", "A. 8-bit", "B. 16-bit", "C. 32-bit", "D. 64-bit",
                        "C" }
        };

        System.out.println("Welcome to the Java Quiz!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.println(questions[i][4]);
            System.out.print("Your answer (A, B, C, or D): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was " + questions[i][5]);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your total score: " + score + "/" + questions.length);
        scanner.close();
    }
}
