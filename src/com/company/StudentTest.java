package com.company;


public class StudentTest extends junit.framework.TestCase{

    public void testCreate(){
        final String firstStudentName = "cxr";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName,student.getName());

        final String secondStudentName = "xiaoming";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName,secondStudent.getName());
    }
}
