package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

public class Quiz extends Lesson {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(Quiz.class);

    public Quiz(int quizNumber, String quizName) {
        super(quizNumber, quizName);

        LOG.debug("New Quiz: {}", this.toString());
    }

    @Override
    public String getLessonLine() {
        return String.format("Quiz %d: %s", lessonNumber, lessonName);
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "lessonNumber=" + lessonNumber +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
