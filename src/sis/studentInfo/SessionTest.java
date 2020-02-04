package sis.studentInfo;

import junit.framework.TestCase;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.Logger;

abstract public class SessionTest extends TestCase {
    abstract protected Session createSession(Course course, Date startDate);

    protected Session session;
    protected Date startDate;
    protected static int CREDITS = 3;

    public void setUp() throws Exception {
        super.setUp();
        this.startDate = UtilDate.createDate(2003, 1, 6);
        session = createSession(createCourse("engl",101),startDate);
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
        CourseSession sessionA = CourseSession.create(createCourse("abc",101),date);
        CourseSession sessionB = CourseSession.create(createCourse("bcd",201),date);
        CourseSession sessionC = CourseSession.create(createCourse("abc",101),date);


        assertEquals(sessionA.compareTo(sessionB),-1);
        assertEquals(sessionB.compareTo(sessionA),1);
        assertEquals(sessionA.compareTo(sessionC),0);


        CourseSession sessionD = CourseSession.create(createCourse("abc",201),date);

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

    public void test_session_url() throws SessionException {
        String url = "http://www.baidu.com";
        session.setUrl(url);
        assertEquals(url,session.getUrl().toString());

    }

    public void test_invalid_session_url(){
        try{
            String url = "";
            session.setUrl(url);
            fail(" exception throw MalformedURLException");
        }catch (SessionException expectedException)
        {
            Throwable cause = expectedException.getCause();
            assertEquals(MalformedURLException.class,cause.getClass());
        }
    }
    public void test_log(){
        Logger log = Logger.getLogger(getClass().getName());
        Handler testHandler = new TestHandler();
        log.addHandler(testHandler);
        String message = "ceshi";
        log.info(message);
        assertEquals(message,((TestHandler) testHandler).getMessage());
    }

    public void test_getClass_getName(){
        assertEquals("sis.studentInfo.CourseSessionTest",getClass().getName());
    }

    protected Course createCourse(String department, int number){
        return new Course(department,number);
    }
}
