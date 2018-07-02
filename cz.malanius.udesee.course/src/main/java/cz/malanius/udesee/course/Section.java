package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class Section {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Section.class);

    private final String sectionName;
    private final int sectionNumber;
    private List<Lesson> lessons;

    public Section(String sectionName, int sectionNumber) {
        this.sectionName = sectionName;
        this.sectionNumber = sectionNumber;
        this.lessons = new LinkedList<>();

        LOG.debug("New Section: {}", this.toString());
    }

    public String getSectionName() {
        return sectionName;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        LOG.debug("Adding Lecture {} to Section {}", lesson.toString(), this.getSectionName());
        this.lessons.add(lesson);
    }

    public String getSectionLine() {
        return "Section " + sectionNumber + ": " + sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", sectionNumber=" + sectionNumber +
                ", lessons=" + lessons +
                '}';
    }
}
