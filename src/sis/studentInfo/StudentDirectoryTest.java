package sis.studentInfo;


import junit.framework.TestCase;

public class StudentDirectoryTest extends TestCase {


    private StudentDirectory dir;
    protected void setUp(){
        dir = new StudentDirectory();
    }

    public void test_store_and_retrieve(){
        int numberOfStudents = 10;

        for(int i=0; i<numberOfStudents; i++){
            Student student = new Student("name"+ i);
            String id = i + "";
            student.setId(id);
            student.setCredits(i);
            dir.add(student);
        }

        for(int j=0; j<numberOfStudents; j++){
            String id = j + "";
            Student student = dir.findById(id);
            assertEquals(id,student.getId());
            assertEquals(j,student.getCredits());
        }

    }
}
