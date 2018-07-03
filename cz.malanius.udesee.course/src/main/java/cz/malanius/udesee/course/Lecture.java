package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

public class Lecture extends Lesson {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Lecture.class);

    public Lecture(int lessonNumber, String lessonName) {
        super(lessonNumber, lessonName);

        LOG.debug("New Lecture: {}", this.toString());
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lessonNumber=" + lessonNumber +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
