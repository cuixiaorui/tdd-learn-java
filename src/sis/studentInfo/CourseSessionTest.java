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

        createSession(createCourse("engl", 101), startDate);
        assertEquals(1, CourseSession.getCount());

        createSession(createCourse("engl", 101), startDate);
        assertEquals(2, CourseSession.getCount());
    }


    protected Session createSession(Course course, Date startDate) {
        CourseSession session = CourseSession.create(course,startDate);
        session.setNumberCredits(CREDITS);
        return session;
    }
}

