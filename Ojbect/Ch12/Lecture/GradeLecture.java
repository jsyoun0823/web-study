package Lecture;

import java.util.List;
import java.util.stream.Collectors;

public class GradeLecture extends Lecture {
    private List<Grade> grades;

    public GradeLecture(String title, int pass, List<Grade> grades, List<Integer> scores) {
        super(title, pass, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return super.evaluate() + ", " + gradesStatistics();
    }

    private String gradesStatistics() {
        return grades.stream()
                .map(grade -> format(grade))
                .collect(Collectors.joining(" "));
    }

    private String format(Grade grade) {
        return String.format("%s:%d", grade.getName(), gradeCount(grade));
    }

    public long gradeCount(Grade grade) {
        return getScores().stream()
                .filter(grade::include)
                .count();
    }
}