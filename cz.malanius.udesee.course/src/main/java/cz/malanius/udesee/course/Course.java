package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Course {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Course.class);

    private final String courseName;
    private List<Section> sections;

    public Course(String courseName, String url) {
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
