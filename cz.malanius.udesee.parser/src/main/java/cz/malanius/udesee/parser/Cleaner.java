package cz.malanius.udesee.parser;

import java.util.stream.Stream;

class Cleaner {

    private static final String PROGRESS_REGEX = "^\\d+ / \\d+$";
    private static final String TIME_REGEX = "^\\d+:\\d+$";
    private static final String RESOURCES_REGEX = "^ .*$";
    private static final String MORE_REGEX = "^Show more \\(\\d+\\)$";

    //Replace regexps
    private static final String SECTION_REGEX = "Section: (\\d+)\\n(.*)\n";
    private static final String SECTION_REPLACE_REGEX = "Section $1: $2\n";

    private Cleaner() {
        //No instances allowed
    }

    static String cleanText(String input) {
        String result;
        result = removeProgress(input);
        result = removeTime(result);
        result = removeResources(result);
        result = removeMore(result);

        result = replaceSections(result);

        return result;
    }

    private static String removeProgress(String input) {
        return clearLines(input, PROGRESS_REGEX);
    }

    private static String removeTime(String input) {
        return clearLines(input, TIME_REGEX);
    }

    private static String removeResources(String input) {
        return clearLines(input, RESOURCES_REGEX);
    }

    private static String removeMore(String input) {
        return clearLines(input, MORE_REGEX);
    }

    private static String replaceSections(String input) {
        return input.replaceAll(SECTION_REGEX, SECTION_REPLACE_REGEX);
    }

    private static String clearLines(String input, String unwantedRegex) {
        StringBuilder output = new StringBuilder();
        Stream.of(input.split("\n"))
                .filter(s -> !s.matches(unwantedRegex))
                .forEach(s -> output.append(s).append("\n"));
        output.deleteCharAt(output.lastIndexOf("\n"));
        return output.toString();
    }

}
