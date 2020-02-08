package sis.studentInfo;

import junit.framework.TestCase;

public class CourseTest extends TestCase {


    public void testEquality(){
        Course courseA = new Course("engl",123);
        Course courseAPrime = new Course("engl",123);
        assertEquals(courseA,courseAPrime);

        Course courseB = new Course("engl",234);
        assertFalse(courseA.equals(courseB));



    }

}
