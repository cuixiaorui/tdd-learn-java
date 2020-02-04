package sis.studentInfo;

import java.util.*;

public class CourseSession extends Session implements Comparable<CourseSession>{

    public static int count;

    protected CourseSession(Course course, Date startDate) {
        super(course,startDate);
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

    public static CourseSession create(Course course, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(course,startDate);
    }

    @Override
    protected int getSessionLength(){
        return 16;
    }
}
