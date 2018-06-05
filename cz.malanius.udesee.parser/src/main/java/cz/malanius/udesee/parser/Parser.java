package cz.malanius.udesee.parser;

import cz.malanius.udesee.course.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Parser.class);

    private static final Pattern sectionPattern = Pattern.compile("^Section (\\d+): (.*)$");
    private static final int sectionNumberGroup = 1;
    private static final int sectionNameGroup = 2;

    private static final Pattern lecturePattern = Pattern.compile("^(\\d+). (.*)$");
    private static final Pattern excercisePattern = Pattern.compile("^Coding Exercise (\\d+): (.*)$");
    private static final Pattern quizPattern = Pattern.compile("^Quiz (\\d+): (.*)$");
    private static final int lessonNumberGroup = 1;
    private static final int lessonNameGroup = 2;


    public static Course parseSections(String input, Course course) throws ParseException {
        String clean = Cleaner.cleanText(input);

        List<String> lines = new ArrayList<>(Arrays.asList(clean.split("\n")));

        Section section = null;
        Lesson lesson;
        int lineNum = 0;

        for (String line : lines) {
            LOG.debug("Parsing line: {}", line);
            Matcher sectionMatcher = sectionPattern.matcher(line);
            Matcher lessonMatcher = lecturePattern.matcher(line);
            Matcher exerciseMatcher = excercisePattern.matcher(line);
            Matcher quizMatcher = quizPattern.matcher(line);

            if (lineNum == 0 && !sectionMatcher.matches()) {
                System.err.println("Input doesn't start with section!");
                throw new ParseException(line, 0);
            } else if (sectionMatcher.matches()) {
                section = getSection(sectionMatcher);
                course.addSection(section);
            } else if (lessonMatcher.matches()) {
                lesson = getLecture(lessonMatcher);
                addLesson(section, lesson, lineNum, line);
            } else if (exerciseMatcher.matches()) {
                lesson = getExercise(exerciseMatcher);
                addLesson(section, lesson, lineNum, line);
            } else if (quizMatcher.matches()) {
                lesson = getQuiz(quizMatcher);
                addLesson(section, lesson, lineNum, line);
            } else {
                LOG.warn("Unknown line type at line {}: {}", lineNum, line);
                course.addErrorLine(line);
            }

            lineNum++;
        }

        return course;

    }

    private static void addLesson(Section section, Lesson lesson, int lineNum, String line) throws ParseException {
        if (section != null) {
            section.addLesson(lesson);
        } else {
            System.err.println("No section to append the lecture to!");
            throw new ParseException(line, lineNum);
        }
    }

    private static Section getSection(Matcher sectionMatcher) {
        String sectionName = sectionMatcher.group(sectionNameGroup);
        int sectionNumber = Integer.parseInt(sectionMatcher.group(sectionNumberGroup));
        return new Section(sectionName, sectionNumber);
    }

    private static Lecture getLecture(Matcher lessonMatcher) {
        String lessonName = lessonMatcher.group(lessonNameGroup);
        int lessonNumber = Integer.parseInt(lessonMatcher.group(lessonNumberGroup));
        return new Lecture(lessonNumber, lessonName);
    }

    private static CodeExercise getExercise(Matcher exerciseMatcher) {
        String exerciseName = exerciseMatcher.group(lessonNameGroup);
        int exerciseNumber = Integer.parseInt(exerciseMatcher.group(lessonNumberGroup));
        return new CodeExercise(exerciseNumber, exerciseName);
    }

    private static Quiz getQuiz(Matcher quizMatcher) {
        String quizName = quizMatcher.group(lessonNameGroup);
        int quizNumber = Integer.parseInt(quizMatcher.group(lessonNumberGroup));
        return new Quiz(quizNumber, quizName);
    }

}
