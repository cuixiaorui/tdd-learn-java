package sis.studentInfo;

import java.util.*;

public class CourseSession {

    public static int count;
    private String department;
    private int number;
    private ArrayList<Student> allStudents;
    private Date startDate;
    private int credits;

    private CourseSession(String department, int number, Date startDate) {
        this.department = department;
        this.number = number;
        this.allStudents = new java.util.ArrayList<Student>();
        this.startDate = startDate;
        this.credits = 0;
    }

    private static void incrementCount() {
        CourseSession.count++;
    }

    public static void resetCount() {
        CourseSession.count = 0;
    }

    public static int getCount() {
        return CourseSession.count;
    }

    public static CourseSession create(String engl, int number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(engl,number,startDate);
    }


    public String getDepartment() {
        return department;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return allStudents.size();
    }

    public void enroll(Student student) {
        student.addCredits(credits);
        allStudents.add(student);
    }

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public Student get(int index) {
        return allStudents.get(index);
    }

    public Date getEndDate() {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);

        final int seesionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridaytoMonday = 3;
        int numberOfDays = seesionLength * daysInWeek - daysFromFridaytoMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setNumberCredits(int credits) {
        this.credits = credits;
    }
}