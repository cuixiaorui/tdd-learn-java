package sis.report;

import sis.studentInfo.Course;
import sis.studentInfo.CourseSession;
import sis.studentInfo.Student;
import sis.studentInfo.UtilDate;
import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

public class RosterReportTest extends TestCase {


    public void testRosterReport() throws IOException {
        Date startDate = UtilDate.createDate(2003, 1, 6);
        CourseSession session =CourseSession.create(new Course("engl",101),startDate);
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));


        Writer writer = new StringWriter();
        new RosterReport(session).writeReport(writer);
        String rosterReport = writer.toString();

        assertEquals(
                RosterReport.ROSTER_REPORT_HEADER +
                        "A" + RosterReport.NEW_LINE + "B" + RosterReport.NEW_LINE +
                        RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEW_LINE, rosterReport
        );
    }
}
