package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("May I have your name?");
        String userName = s.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;

        while (i < 3) {
            Random random = new Random();
            int randomNumber = random.nextInt(99) + 1;

            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();
            if (randomNumber % 2 == 0) {
                String correctAnswer = "yes";
                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " +   userName + "!");
                    i = 0;
                }
            } else {
                String correctAnswer = "no";
                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + userName + "!");
                    i = 0;
                }

            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
