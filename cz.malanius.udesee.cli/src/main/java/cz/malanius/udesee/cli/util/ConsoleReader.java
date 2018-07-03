package cz.malanius.udesee.cli.util;

import java.util.Scanner;

import static cz.malanius.udesee.cli.util.ConsoleWriter.printUserInfo;
import static cz.malanius.udesee.cli.util.ConsoleWriter.printUserWarn;

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
                    printUserWarn("Incorrect choice, please choose between 1-" + optionsCount);
                }
            } catch (NumberFormatException ex) {
                printUserWarn("Not a number!");
            }

        }
        return chosen;
    }

    public static boolean yesOrNo(String prompt, boolean defaultIsYes) {
        boolean correct = false;
        String choice = defaultIsYes ? " [Y/n]?" : " [y/N]?";
        String chosen = null;
        while (!correct) {
            printUserInfo(prompt + choice);
            chosen = scanner.nextLine().toLowerCase();
            if (!chosen.equals("y") && !chosen.equals("n") && !chosen.equals("")) {
                printUserWarn("Incorrect choice, please try again!");
            } else {
                correct = true;
            }
        }

        if (chosen.equals("")) {
            return defaultIsYes;
        }

        return chosen.equals("y");

    }
}
