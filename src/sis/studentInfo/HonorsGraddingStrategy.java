package sis.studentInfo;

public class HonorsGraddingStrategy extends BasicGraddingStrategy{
    public int getGradePointsFor(Student.Grade grade)
    {
        int point = bacisGradePointsFor(grade);
        return point+=1;
    }
}
