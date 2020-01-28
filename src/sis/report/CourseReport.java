package sis.report;

import sis.studentInfo.CourseSession;

import java.util.ArrayList;

public class CourseReport {

    private ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();
    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        StringBuffer buffer = new StringBuffer();
        for(CourseSession session : sessions )
        {
            buffer.append(session.getDepartment());
            buffer.append(" ");
            buffer.append(session.getNumber());
            buffer.append(RosterReport.NEW_LINE);
        }
        return buffer.toString();
   }
}
