package sis.report;

import sis.studentInfo.CourseSession;
import sis.studentInfo.Student;

public class RosterReport {
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student" + NEW_LINE + "----" + NEW_LINE;
    public static final Object ROSTER_REPORT_FOOTER = NEW_LINE + "# students = ";

    private CourseSession session;

    public RosterReport(CourseSession session) {
        this.session = session;
    }

    public String getReport(){
        StringBuffer buffer = new StringBuffer();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);
        return buffer.toString();
    }

    private void writeFooter(StringBuffer buffer) {
        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(session.getAllStudents().size());
        buffer.append(NEW_LINE);
    }

    private void writeBody(StringBuffer buffer) {
        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEW_LINE);
        }
    }

    private void writeHeader(StringBuffer buffer) {
        buffer.append(ROSTER_REPORT_HEADER);
    }
}
