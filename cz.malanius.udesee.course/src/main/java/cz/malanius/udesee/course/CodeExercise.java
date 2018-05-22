package cz.malanius.udesee.course;

import org.slf4j.LoggerFactory;

public class CodeExercise extends Lesson {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(CodeExercise.class);

    public CodeExercise(int exerciseNumber, String exerciseName) {
        super(exerciseNumber, exerciseName);

        LOG.debug("New Code Exercise: {}", this.toString());
    }

    @Override
    public String getLessonLine() {
        return String.format("Code Exercise %d: %s", lessonNumber, lessonName);
    }

    @Override
    public String toString() {
        return "CodeExercise{" +
                "lessonNumber=" + lessonNumber +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
