package sis.report;

import sis.studentInfo.CourseSession;
import sis.studentInfo.Student;
import sis.studentInfo.UtilDate;
import junit.framework.TestCase;

import java.util.Date;

public class RosterReportTest extends TestCase {


    public void testRosterReport(){
        Date startDate = UtilDate.createDate(2003, 1, 6);
        CourseSession session = new CourseSession("engl",101,startDate);
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReport(session).getReport();// session.getRosterReport();
        assertEquals(
                RosterReport.ROSTER_REPORT_HEADER +
                        "A" + RosterReport.NEW_LINE + "B" + RosterReport.NEW_LINE +
                        RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEW_LINE, rosterReport
        );
    }

}
