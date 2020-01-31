package sis.studentInfo;

import java.util.*;

public class CourseSession extends Session implements Comparable<CourseSession>{

    public static int count;

    protected CourseSession(String department, int number, Date startDate) {
        super(department,number,startDate);
    }

    private static void incrementCount() {
        CourseSession.count++;
    }

    public static void resetCount() {
        CourseSession.count = 0;
    }

    public static int getCount() {
        return CourseSession.count;
    }

    public static CourseSession create(String department, int number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(department,number,startDate);
    }

    @Override
    protected int getSessionLength(){
        return 16;
    }
}
