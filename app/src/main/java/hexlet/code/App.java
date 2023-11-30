package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                hexlet.code.Cli.greeting();
            case 2:
                System.out.println("Welcome to the Brain Games!");
                hexlet.code.Even.even();
            case 0:
                break;
            default:
                System.out.println("Unexpected exception. Try again.");
        }
    }
}
