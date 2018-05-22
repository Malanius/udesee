package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class Section {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Section.class);

    private final String sectionName;
    private final int sectionNumber;
    private List<Lecture> lectures;

    public Section(String sectionName, int sectionNumber) {
        this.sectionName = sectionName;
        this.sectionNumber = sectionNumber;
        this.lectures = new LinkedList<>();

        LOG.debug("New Section: {}", this.toString());
    }

    public String getSectionName() {
        return sectionName;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void addLesson(Lecture lecture) {
        LOG.debug("Adding Lecture {} to Section {}", lecture.toString(), this.getSectionName());
        this.lectures.add(lecture);
    }

    public String getSectionLine() {
        return "Section " + sectionNumber + ": " + sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", sectionNumber=" + sectionNumber +
                ", lectures=" + lectures +
                '}';
    }
}
