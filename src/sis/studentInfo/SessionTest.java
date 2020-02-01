package sis.studentInfo;

import junit.framework.TestCase;

import java.util.Date;

abstract public class SessionTest extends TestCase {
    abstract protected Session createSession(String department, int number, Date startDate);

    protected Session session;
    protected Date startDate;
    protected static int CREDITS = 3;

    public void setUp() throws Exception {
        super.setUp();
        this.startDate = UtilDate.createDate(2003, 1, 6);
        session = createSession("engl",101,startDate);
    }

    public void testCreated() {
        String department = session.getDepartment();
        int number = session.getNumber();
        assertEquals(department, "engl");
        assertEquals(number, 101);
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
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

    public void testGetSessionLength(){
        assertTrue(session.getSessionLength() > 0);
    }

}
