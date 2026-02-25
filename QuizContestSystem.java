import java.util.Scanner;

/**
 * A multiple-choice quiz contest system.
 */
public class QuizContestSystem {
    private static class Question {
        String prompt;
        String[] options;
        int answer; // 1-4

        Question(String prompt, String[] options, int answer) {
            this.prompt = prompt;
            this.options = options;
            this.answer = answer;
        }

        boolean check(int choice) {
            return choice == answer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question[] quiz = {
                new Question("What is the capital of France?",
                        new String[] { "1. Berlin", "2. Paris", "3. Rome", "4. Madrid" }, 2),
                new Question("Which planet is known as the Red Planet?",
                        new String[] { "1. Earth", "2. Venus", "3. Mars", "4. Jupiter" }, 3),
                new Question("What is 5 + 7?", new String[] { "1. 10", "2. 12", "3. 13", "4. 15" }, 2),
                new Question("Who wrote 'Java Programming'?",
                        new String[] { "1. James Gosling", "2. Bill Gates", "3. Steve Jobs", "4. Mark Zuckerberg" }, 1)
        };

        System.out.println("--- Welcome to the Quiz Contest! ---");
        int score = 0;

        for (Question q : quiz) {
            System.out.println("\n" + q.prompt);
            for (String opt : q.options)
                System.out.println(opt);
            System.out.print("Your answer (1-4): ");
            int choice = scanner.nextInt();

            if (q.check(choice)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + q.answer);
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your final score: " + score + "/" + quiz.length);
        scanner.close();
    }
}
