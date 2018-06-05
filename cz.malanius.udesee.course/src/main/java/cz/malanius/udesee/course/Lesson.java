package cz.malanius.udesee.course;

public abstract class Lesson {
    final int lessonNumber;
    final String lessonName;

    Lesson(int exerciseNumber, String exerciseName) {
        this.lessonNumber = exerciseNumber;
        this.lessonName = exerciseName;
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
        return "Lecture{" +
                "lessonNumber=" + lessonNumber +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
