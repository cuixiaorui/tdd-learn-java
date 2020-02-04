package sis.studentInfo;

import java.util.HashMap;
import java.util.Map;

public class StudentDirectory {


    private Map<String,Student> students = new HashMap<String,Student>();

    public void add(Student student) {
        students.put(student.getId(),student);
    }

    public Student findById(String id) {
        return students.get(id);
    }
}
