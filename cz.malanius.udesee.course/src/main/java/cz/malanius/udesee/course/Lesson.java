package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

public class Lesson {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Lesson.class);

    private final int lessonNumber;
    private final String lessonName;

    public Lesson(int lessonNumber, String lessonName) {
        this.lessonNumber = lessonNumber;
        this.lessonName = lessonName;

        LOG.debug("New Lesson: {}", this.toString());
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getLessonLine() {
        return lessonNumber + ". " + lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonNumber=" + lessonNumber +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
