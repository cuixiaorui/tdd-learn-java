package sis.studentInfo;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SummerCourseSession extends CourseSession {

    public static SummerCourseSession create(String department, int number, Date startDate) {
        return new SummerCourseSession(department,number,startDate);
    }

    private SummerCourseSession(String department, int number, Date startDate) {
        super(department,number,startDate);
    }

    @Override
    protected int getSessionLength(){
        return 8;
    }
}
