package sis.studentInfo;

public class Student {
    public static final int CREDITS_REQUIDRD_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";
    private String name;
    private int credits;
    private String state = "";

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIDRD_FOR_FULL_TIME;
    }

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
}
