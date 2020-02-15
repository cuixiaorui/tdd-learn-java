package sis.report;

import sis.studentInfo.Course;
import sis.studentInfo.CourseSession;
import sis.studentInfo.Student;
import sis.studentInfo.UtilDate;
import junit.framework.TestCase;

import java.io.*;
import java.util.Date;

public class RosterReportTest extends TestCase {


    private CourseSession session;

    protected void setUp() {
        Date startDate = UtilDate.createDate(2003, 1, 6);
        session = CourseSession.create(new Course("engl", 101), startDate);
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
    }

    public void testRosterReport() throws IOException {

        Writer writer = new StringWriter();
        new RosterReport(this.session).writeReport(writer);
        String rosterReport = writer.toString();

        assertReportContents(rosterReport);
    }


    public void testFiledReport() throws IOException {
        final String filename = "testFiledReport.txt";

        try {
            delete(filename);
            new RosterReport(session).writeReport(filename);

            StringBuffer buffer = new StringBuffer();
            String line;

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append(RosterReport.NEW_LINE);
            }
            reader.close();
            assertReportContents(buffer.toString());
        }
        finally {
            delete(filename);
        }
    }

    private void delete(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            boolean result = file.delete();
            assertTrue("unable to delete" + filename, result);
        }
    }

    private void assertReportContents(String rosterReport) {
        assertEquals(
                RosterReport.ROSTER_REPORT_HEADER +
                        "A" + RosterReport.NEW_LINE + "B" + RosterReport.NEW_LINE +
                        RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEW_LINE, rosterReport
        );
    }
}
