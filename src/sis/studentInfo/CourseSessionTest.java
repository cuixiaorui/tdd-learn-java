package sis.studentInfo;

import junit.framework.TestCase;

import java.util.Date;

public class CourseSessionTest extends SessionTest {

    public void testCourseDates() {
        Date sixteenWeeksOut = UtilDate.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }


    public void testCount() {
        CourseSession.resetCount();

        createSession("engl", 101, startDate);
        assertEquals(1, CourseSession.getCount());

        createSession("engl", 101, startDate);
        assertEquals(2, CourseSession.getCount());
    }

    protected Session createSession(String department, int number, Date startDate) {
        CourseSession session = CourseSession.create(department,number,startDate);
        session.setNumberCredits(CREDITS);
        return session;
    }
}

