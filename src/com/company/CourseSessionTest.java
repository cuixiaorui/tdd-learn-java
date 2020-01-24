package com.company;

import junit.framework.TestCase;

import java.util.ArrayList;

public class CourseSessionTest extends TestCase {

    private CourseSession session;
    public void setUp() throws Exception {
        super.setUp();
        session = new CourseSession("engl",101);

    }

    public void testCreated(){
       String department =  session.getDepartment();
       int number = session.getNumber();
       assertEquals(department,"engl");
       assertEquals(number,101);
       assertEquals(0,session.getNumberOfStudents());
    }

    public void testEnrollStudents(){

        Student student1 = new Student("cxr");
        Student student2 = new Student("xiaoming");

        session.enroll(student1);

        assertEquals(1,session.getNumberOfStudents());
        assertEquals(student1,session.get(0));

        session.enroll(student2);

        assertEquals(2,session.getNumberOfStudents());
        assertEquals(student1,session.get(0));
        assertEquals(student2,session.get(1));

    }
}
