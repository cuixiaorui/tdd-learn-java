package sis.studentInfo;

public class HonorsGraddingStrategy extends BasicGraddingStrategy{
    public int getGradePointsFor(Student.Grade grade)
    {
        int point = super.getGradePointsFor(grade);
        return point+=1;
    }
}
