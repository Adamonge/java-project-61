package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting(){
        Scanner s = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = s.next();
        System.out.println("Hello " + userName + "!");
    }
}
