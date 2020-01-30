package sis.studentInfo;

public class RegularGraddingStrategy extends BasicGraddingStrategy implements GraddingStrategy  {
    public int getGradePointsFor(Student.Grade grade)
    {
        return bacisGradePointsFor(grade);
    }
}
