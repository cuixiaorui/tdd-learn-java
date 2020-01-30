package sis.studentInfo;

public class BasicGraddingStrategy implements GraddingStrategy{

    public int getGradePointsFor(Student.Grade grade)
    {
        return bacisGradePointsFor(grade);
    }

    private int bacisGradePointsFor(Student.Grade grade){
        switch (grade)
        {
            case A: return 4;
            case B: return 3;
            case C: return 2;
            case D: return 1;
            default: return 0;
        }
    }
}
