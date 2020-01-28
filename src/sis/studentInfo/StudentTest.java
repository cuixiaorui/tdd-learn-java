package sis.studentInfo;


public class StudentTest extends junit.framework.TestCase{

    private static final double GRADE = 0.5;

    public void testCreate(){
        final String firstStudentName = "cxr";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName,student.getName());

        final String secondStudentName = "xiaoming";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName,secondStudent.getName());
    }


    public void testStudentStatus(){

        Student student = new Student("xiaomign");
        assertEquals(0,student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3,student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7,student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIDRD_FOR_FULL_TIME,student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testStudentInState(){
        Student student = new Student("xiaoming");
        assertFalse(student.isInState());

        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());

        student.setState("TS");
        assertFalse(student.isInState());

        student.setState("co");
        assertTrue(student.isInState());
    }


    public void testCalculateGpa(){
        Student student = new Student("xiaoming");
        assertGpa(0.0,student);
        student.addGrade("A");
        assertGpa(4.0,student);
        student.addGrade("B");
        assertGpa(3.5,student);
        student.addGrade("C");
        assertGpa(3.0,student);
        student.addGrade("D");
        assertGpa(2.5,student);
        student.addGrade("E");
        assertGpa(2.0,student);
    }

    private void assertGpa(double expectGpa, Student student){
        assertEquals(expectGpa,student.getGpa(),GRADE);
    }
}

