package sis.studentInfo;

public class BasicGraddingStrategy implements GraddingStrategy{

    public int getGradePointsFor(Student.Grade grade)
    {
        return bacisGradePointsFor(grade);
    }

    private int bacisGradePointsFor(Student.Grade grade){
        return grade.getPoint();
    }
}
