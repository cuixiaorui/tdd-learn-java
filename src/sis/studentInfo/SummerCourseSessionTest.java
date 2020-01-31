package sis.studentInfo;

        import junit.framework.TestCase;

        import java.util.Date;

public class SummerCourseSessionTest extends TestCase {

    public void testEndDate() {
        Date startDate = new Date(2003, 6, 9);
        CourseSession session = (SummerCourseSession) SummerCourseSession.create("ENGL", 400, startDate);

        Date eigthWeeksout = new Date(2003, 7, 31);
        assertEquals(eigthWeeksout, session.getEndDate());
    }

}
