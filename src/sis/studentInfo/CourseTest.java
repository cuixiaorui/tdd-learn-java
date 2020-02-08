package sis.studentInfo;

import junit.framework.TestCase;

public class CourseTest extends TestCase {


    public void testEquality(){
        Course courseA = new Course("engl",123);
        Course courseAPrime = new Course("engl",123);

        Course courseB = new Course("engl",234);
        assertFalse(courseA.equals(courseB));

        // 自反性
        assertEquals(courseA,courseA);

        // 对称性
        assertEquals(courseA,courseAPrime);
        assertEquals(courseAPrime,courseA);

        assertFalse(courseA.equals(null));
    }

}
