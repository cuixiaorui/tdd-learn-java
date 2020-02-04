package sis.report;

import junit.framework.TestCase;
import sis.studentInfo.Course;
import sis.studentInfo.CourseSession;

import java.util.Date;

public class CourseReportTest extends TestCase {

    public void testReport() {
        // given
        CourseReport report = new CourseReport();
        Date date = new Date();
        report.add(CourseSession.create(new Course("engl", 101), date));
        report.add(CourseSession.create(new Course("azec", 201), date));
        report.add(CourseSession.create(new Course("btal", 301), date));

        // when
        String result = report.text();

        // then
        assertEquals(result,
                   "azec 201" + RosterReport.NEW_LINE
                        + "btal 301" + RosterReport.NEW_LINE
                        + "engl 101" + RosterReport.NEW_LINE
        );
    }
}
