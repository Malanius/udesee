package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Course {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Course.class);

    private final String courseName;
    private List<Section> sections;
    private List<String> errorLines = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
        this.sections = new LinkedList<>();

        LOG.debug("New course: {}", this.toString());
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Section> getSections() {
        return sections;
    }

    public List<String> getErrorLines() {
        return errorLines;
    }

    public void addErrorLine(String line) {
        errorLines.add(line);
    }

    public void addSection(Section section) {
        this.sections.add(section);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", sections=" + sections +
                '}';
    }
}
