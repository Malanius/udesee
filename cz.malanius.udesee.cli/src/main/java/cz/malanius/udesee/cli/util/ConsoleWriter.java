package cz.malanius.udesee.cli.util;

import java.util.List;

public class ConsoleWriter {

    public static void printUserMessage(String message, TextColor color) {
        System.out.println(color + message + TextColor.RESET);
    }

    public static void printUserInfo(String message) {
        printUserMessage(message, TextColor.BLUE);
    }

    public static void printUserWarn(String message) {
        printUserMessage(message, TextColor.YELLOW);
    }

    public static void printUserError(String message) {
        printUserMessage(message, TextColor.RED);
    }

    public static void printUserOk(String message) {
        printUserMessage(message, TextColor.GREEN);
    }

    public static <T> void printListSelection(List<T> list) {
        final int[] index = {1};
        list.forEach(element -> {
            printUserInfo(String.format("%d: %s", index[0], element.toString()));
            index[0]++;
        });
    }
}
