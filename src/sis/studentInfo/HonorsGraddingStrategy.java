package sis.studentInfo;

public class HonorsGraddingStrategy extends BasicGraddingStrategy implements GraddingStrategy{
    public int getGradePointsFor(Student.Grade grade)
    {
        int point = bacisGradePointsFor(grade);
        return point+=1;
    }
}
