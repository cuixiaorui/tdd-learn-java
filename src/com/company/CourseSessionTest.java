package com.company;

import junit.framework.TestCase;

import java.util.Date;

public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;
    public void setUp() throws Exception {
        super.setUp();
        int year = 103;
        int month = 0;
        int date = 6;
        startDate = new Date(year,month,date);
        session = new CourseSession("engl",101, startDate);

    }

    public void testCreated(){
       String department =  session.getDepartment();
       int number = session.getNumber();
       assertEquals(department,"engl");
       assertEquals(number,101);
       assertEquals(0,session.getNumberOfStudents());
       assertEquals(startDate,session.getStartDate());
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

    public void testCourseDates(){
        int year = 103;
        int month = 3;
        int date = 25;

        Date sixteenWeeksOut = new Date(year,month,date);
        assertEquals(sixteenWeeksOut,session.getEndDate());

    }

}
