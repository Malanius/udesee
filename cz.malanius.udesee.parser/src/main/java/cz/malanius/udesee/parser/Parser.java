package cz.malanius.udesee.parser;

import cz.malanius.udesee.course.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final Pattern sectionPattern = Pattern.compile("^Section (\\d+): (.*)$");
    private static final int sectionNumberGroup = 1;
    private static final int sectionNameGroup = 2;

    private static Pattern lessonPattern = Pattern.compile("^(\\d+). (.*)$");
    private static final int lessonNumberGroup = 1;
    private static final int lessonNameGroup = 2;


    public static Course parseSections(String input, Course course) throws ParseException {
        String clean = Cleaner.cleanText(input);

        List<String> lines = new ArrayList<>(Arrays.asList(clean.split("\n")));

        Section section = null;
        Lesson lesson;
        int lineNum = 0;

        for (String line : lines) {
            Matcher sectionMatcher = sectionPattern.matcher(line);
            Matcher lessonMatcher = lessonPattern.matcher(line);

            if (lineNum == 0 && !sectionMatcher.matches()) {
                System.err.println("Input doesn't start with section!");
                throw new ParseException(line, 0);
            } else if (sectionMatcher.matches()) {
                String sectionName = sectionMatcher.group(sectionNameGroup);
                int sectionNumber = Integer.parseInt(sectionMatcher.group(sectionNumberGroup));
                section = new Section(sectionName, sectionNumber);
                course.addSection(section);
            } else if (lessonMatcher.matches()) {
                String lessonName = lessonMatcher.group(lessonNameGroup);
                int lessonNumber = Integer.parseInt(lessonMatcher.group(lessonNumberGroup));
                lesson = new Lesson(lessonNumber, lessonName);
                if (section != null) {
                    section.addLesson(lesson);
                } else {
                    System.err.println("No section to append the lesson to!");
                    throw new ParseException(line, 0);
                }
            } else {
                System.err.println("Unknown line type!");
            }

            lineNum++;
        }

        return course;

    }


}
