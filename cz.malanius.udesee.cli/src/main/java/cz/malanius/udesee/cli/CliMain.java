package cz.malanius.udesee.cli;

import cz.malanius.udesee.cli.util.ConsoleReader;
import cz.malanius.udesee.cli.util.ConsoleWriter;
import cz.malanius.udesee.course.Course;
import cz.malanius.udesee.exporter.ExporterService;
import cz.malanius.udesee.parser.Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;

import static cz.malanius.udesee.cli.util.ConsoleWriter.*;

public class CliMain {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CliMain.class);

    private static List<ExporterService> exporters = new ArrayList<>();

    public static void main(String[] args) {
        LOG.trace("Udesee started in CLI with arguments: {}", Arrays.toString(args));

        loadExporters();
        Course course = importCourse();
        ExporterService chosenExporter = promptExporter();
        chosenExporter.exportWithCli(course);

    }


    private static void loadExporters() {
        ServiceLoader.load(ExporterService.class).forEach(exporters::add);
        if (exporters.isEmpty()) {
            LOG.error("No exporters found.");
            printUserError("No exporters were loaded, exiting.");
            System.exit(1);
        }
    }

    private static ExporterService promptExporter() {
        ConsoleWriter.printUserInfo("Available exporters:");
        ConsoleWriter.printListSelection(exporters);
        ConsoleWriter.printUserInfo("Please select exporter to use:");
        int exporterChoice = ConsoleReader.select(exporters.size()) - 1;
        return exporters.get(exporterChoice);
    }

    private static Course importCourse() {
        printUserInfo("Enter the course name: ");
        String courseName = ConsoleReader.readLine();
        Course course = new Course(courseName);

        printUserInfo("Please provide path to the input file: ");
        String path = ConsoleReader.readLine();

        String lines = readCourseFromFile(path);

        try {
            course = Parser.parseSections(lines, course);
        } catch (ParseException ex) {
            LOG.error("Error occurred during parsing of a course!", ex);
            printUserError("Course can't be correctly parsed. Check if copied correctly and try again.");
            System.exit(1);
        }

        if (!course.getIgnoredLines().isEmpty()) {
            printUserWarn("Course imported, some lines were ignored.");
            for (String errorLine : course.getIgnoredLines()) {
                printUserWarn("\t" + errorLine);
            }
        } else {
            printUserOk("Course successfully imported.");
        }

        return course;
    }

    private static String readCourseFromFile(String path) {
        StringBuilder lines = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.append(line).append("\n");
            }

        } catch (IOException ex) {
            LOG.error("Error occurred during I/O operation.", ex);
            printUserError("Sorry, something went wrong during reading of the specified file.");
            System.exit(1);
        }

        return lines.toString();
    }

}
