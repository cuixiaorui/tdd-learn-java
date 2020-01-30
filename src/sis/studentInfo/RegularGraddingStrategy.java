package sis.studentInfo;

public class RegularGraddingStrategy extends BasicGraddingStrategy {
    public int getGradePointsFor(Student.Grade grade)
    {
        return bacisGradePointsFor(grade);
    }
}
