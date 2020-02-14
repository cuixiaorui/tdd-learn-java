package sis.report;

import sis.studentInfo.CourseSession;
import sis.studentInfo.Student;

import java.io.Writer;
import java.io.*;

public class RosterReport {
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student" + NEW_LINE + "----" + NEW_LINE;
    public static final String ROSTER_REPORT_FOOTER = NEW_LINE + "# students = ";

    private CourseSession session;
    private Writer writer;

    public RosterReport(CourseSession session) {
        this.session = session;
    }

    private void writeFooter() throws IOException {
        writer.write(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEW_LINE);
    }

    private void writeBody() throws IOException {
        for (Student student : session.getAllStudents()) {
            writer.write(student.getName() + NEW_LINE);
        }
    }

    private void writeHeader() throws IOException {
        writer.write(ROSTER_REPORT_HEADER);
    }

    public void writeReport(Writer writer) throws IOException {
        this.writer = writer;
        writeHeader();
        writeBody();
        writeFooter();
    }

    public void writeReport(String filename) throws IOException {

        Writer writer = new BufferedWriter(new FileWriter(filename));
        try {
            writeReport(writer);
        } finally {
            writer.close();
        }
    }
}
