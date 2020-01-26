package com.company;

import java.util.*;

public class CourseSession {

    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student" + NEW_LINE + "----" + NEW_LINE;
    public static final Object ROSTER_REPORT_FOOTER = NEW_LINE + "# students = ";
    private String department;
    private int number;
    private ArrayList<Student> allStudents;
    private Date startDate;

    public CourseSession(String department, int number, Date startDate) {
        this.department = department;
        this.number = number;
        this.allStudents = new java.util.ArrayList<Student>();
        this.startDate = startDate;
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

    public String getRosterReport() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student : allStudents) {
            buffer.append(student.getName());
            buffer.append(NEW_LINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(allStudents.size());
        buffer.append(NEW_LINE);
        return buffer.toString();
    }
}
