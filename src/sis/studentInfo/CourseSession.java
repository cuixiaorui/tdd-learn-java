package sis.studentInfo;

import java.util.*;

public class CourseSession implements Comparable<CourseSession>{

    public static int count;
    private String department;
    private int number;
    private List<Student> allStudents;
    private Date startDate;
    private int credits;

    protected CourseSession(String department, int number, Date startDate) {
        this.department = department;
        this.number = number;
        this.allStudents = new LinkedList<Student>();
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

    public static CourseSession create(String department, int number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(department,number,startDate);
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

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public Student get(int index) {
        return allStudents.get(index);
    }

    public Date getEndDate() {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(getStartDate());

        final int daysInWeek = 7;
        final int daysFromFridaytoMonday = 3;
        int numberOfDays = getSessionLength() * daysInWeek - daysFromFridaytoMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    protected int getSessionLength(){
        return 16;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setNumberCredits(int credits) {
        this.credits = credits;
    }


    public int compareTo(CourseSession that){

        int compareResult = this.getDepartment().compareTo(that.getDepartment());

        if(compareResult != 0){
            return compareResult;
        }
        return Integer.toString(this.getNumber()).compareTo(Integer.toString( that.getNumber()));
    }
}
