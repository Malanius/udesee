package cz.malanius.udesee.cli;

import cz.malanius.udesee.course.Course;
import cz.malanius.udesee.parser.Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

import static cz.malanius.udesee.cli.util.ConsoleWriter.*;

public class CliMain {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CliMain.class);

    public static void main(String[] args) {
        LOG.trace("Udesee started in CLI with arguments: {}", Arrays.toString(args));
        Scanner sc = new Scanner(System.in);

        printUserInfo("Enter the course name: ");
        String courseName = sc.nextLine();
        Course course = new Course(courseName, "URL");

        printUserInfo("Please provide path to the input file: ");
        String path = sc.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            String line;
            StringBuilder lines = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                lines.append(line).append("\n");
            }
            course = Parser.parseSections(lines.toString(), course);
            if (!course.getErrorLines().isEmpty()) {
                printUserWarn("Course imported, but some lines can't be interpreted:");
                for (String errorLine : course.getErrorLines()) {
                    printUserWarn("\t" + errorLine);
                }
                printUserWarn("Please report this on https://github.com/Malanius/udesee/issues");
            } else {
                printUserOk("Course successfully imported.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
            printUserError("Sorry, something went wrong. Check logs for more detail.");
        }

    }

}
