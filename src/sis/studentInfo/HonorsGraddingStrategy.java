package sis.studentInfo;

public class HonorsGraddingStrategy implements GraddingStrategy{
    public int getGradePointsFor(Student.Grade grade)
    {
        int point = bacisGradePointsFor(grade);
        return point+=1;
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
