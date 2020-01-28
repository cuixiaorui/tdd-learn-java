package sis.report;

import junit.framework.TestCase;
import sis.studentInfo.CourseSession;

import java.util.Date;

public class CourseReportTest extends TestCase {

    public void testReport() {
        CourseReport report = new CourseReport();
        Date date = new Date();
        report.add(CourseSession.create("engl", 101, date));
        report.add(CourseSession.create("czec", 201, date));
        report.add(CourseSession.create("ital", 301, date));

        String result = report.text();
        assertEquals(result, "engl 101" + RosterReport.NEW_LINE + "czec 201" + RosterReport.NEW_LINE + "ital 301"+ RosterReport.NEW_LINE );
    }
}
