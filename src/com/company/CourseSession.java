package com.company;

import java.util.ArrayList;

public class CourseSession {

    private String department;
    private int number;
    private java.util.ArrayList<Student> allStudents;
    public CourseSession(String department, int number) {
        this.department = department;
        this.number = number;
        this.allStudents = new java.util.ArrayList<Student>();
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
}
