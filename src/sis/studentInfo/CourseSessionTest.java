package sis.studentInfo;

import junit.framework.TestCase;

import java.util.Date;

public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;
    private static int CREDITS = 3;

    public void setUp() throws Exception {
        super.setUp();
        this.startDate = UtilDate.createDate(2003, 1, 6);
        session = createCourseSession();
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

        assertEquals(student1.getCredits(),CREDITS);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        session.enroll(student2);

        assertEquals(student2.getCredits(),CREDITS);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = UtilDate.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }


    public void testCount() {
        CourseSession.resetCount();

        createCourseSession();
        assertEquals(1, CourseSession.getCount());

        createCourseSession();
        assertEquals(2, CourseSession.getCount());
    }


    private CourseSession createCourseSession() {

        CourseSession session = CourseSession.create("engl", 101, startDate);
        session.setNumberCredits(CREDITS);
        return session;
    }

    public void testComparable(){
        Date date = new Date();
        CourseSession sessionA = CourseSession.create("abc",101,date);
        CourseSession sessionB = CourseSession.create("bcd",201,date);
        CourseSession sessionC = CourseSession.create("abc",101,date);


        assertEquals(sessionA.compareTo(sessionB),-1);
        assertEquals(sessionB.compareTo(sessionA),1);
        assertEquals(sessionA.compareTo(sessionC),0);


        CourseSession sessionD = CourseSession.create("abc",201,date);

        assertEquals(sessionD.compareTo(sessionA),1);
    }


}

