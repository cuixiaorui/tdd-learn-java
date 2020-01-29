package sis.studentInfo;

public class HonorsGraddingStrategy implements GraddingStrategy{
    public int getGradePointsFor(Student.Grade grade)
    {
        if(grade.equals(Student.Grade.A))return 5;
        if(grade.equals(Student.Grade.B))return 4;
        if(grade.equals(Student.Grade.C))return 3;
        if(grade.equals(Student.Grade.D))return 2;
        return 0;
    }
}
