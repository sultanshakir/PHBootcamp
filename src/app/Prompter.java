package app;

import java.util.Scanner;

public class Prompter {
    public static void prompt(String text, Action<String> action) {
        Printer.print(text + " ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        action.execute(input);
    }
}
