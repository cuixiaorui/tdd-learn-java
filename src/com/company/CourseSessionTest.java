package com.company;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;

    public void setUp() throws Exception {
        super.setUp();
        this.startDate = createDate(2003, 1, 6);
        session = new CourseSession("engl", 101, startDate);

    }

    private Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }

    public void testCreated() {
        String department = session.getDepartment();
        int number = session.getNumber();
        assertEquals(department, "engl");
        assertEquals(number, 101);
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    public void testEnrollStudents() {

        Student student1 = new Student("cxr");
        Student student2 = new Student("xiaoming");

        session.enroll(student1);

        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        session.enroll(student2);

        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    public void testRosterReport() {

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = session.getRosterReport();
        assertEquals(
                CourseSession.ROSTER_REPORT_HEADER +
                        "A" + CourseSession.NEW_LINE + "B" + CourseSession.NEW_LINE +
                        CourseSession.ROSTER_REPORT_FOOTER + "2" + CourseSession.NEW_LINE, rosterReport
        );


    }

}
