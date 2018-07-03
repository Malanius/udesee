package cz.malanius.udesee.cli.util;

import java.util.Scanner;

public class ConsoleReader {
    private static Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    public static int select(int optionsCount) {
        boolean correct = false;
        int chosen = -1;
        while (!correct) {
            try {
                chosen = Integer.parseInt(scanner.nextLine());
                if (chosen > 0 && chosen <= optionsCount) {
                    correct = true;
                } else {
                    ConsoleWriter.printUserWarn("Incorrect choice, please choose between 1-" + optionsCount);
                }
            } catch (NumberFormatException ex) {
                ConsoleWriter.printUserWarn("Not a number!");
            }

        }
        return chosen;
    }
}
