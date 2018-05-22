package cz.malanius.udesee.cli.util;

/**
 * Provides different text colors to CLI text using ANSI escape codes.
 */
public enum TextColor {

    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001b[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001b[37m");

    private final String asciiEscape;

    TextColor(String asciiEscape) {
        this.asciiEscape = asciiEscape;
    }

    @Override
    public String toString() {
        return asciiEscape;
    }
}


