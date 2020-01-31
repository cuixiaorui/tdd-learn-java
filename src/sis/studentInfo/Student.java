package sis.studentInfo;

import java.util.ArrayList;

public class Student {
    public static final int CREDITS_REQUIDRD_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";
    private String name;
    private int credits;
    private String state = "";
    private ArrayList<Grade> grades= new ArrayList<Grade>();
    private GraddingStrategy graddingStrategy = new BasicGraddingStrategy();

    public void setGradingStrategy(GraddingStrategy graddingStrategy) {
        this.graddingStrategy = graddingStrategy;
    }

    public enum Grade{
        A(4),
        B(3),
        C(2),
        D(1),
        E(0);

        private int point;
        Grade(int point){
            this.point= point;
        }

        int getPoint(){
            return this.point;
        }
    };

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIDRD_FOR_FULL_TIME; }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isInState() {
        return this.state.toUpperCase().equals(Student.IN_STATE);
    }

    public void setState(String state){
        this.state = state;
    }

    public double getGpa() {
        if(grades.isEmpty())return 0.0;
        double total = 0.0;
        for(Grade grade : grades)
        {
            total += this.graddingStrategy.getGradePointsFor(grade);
        }
        return total / grades.size();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}
