package sis.report;

import sis.studentInfo.Student;

import java.util.EnumMap;
import java.util.Map;

public class ReportCard {
    public static final String A_MESSAGE = "Excellent";
    public static final String B_MESSAGE = "Very Good";
    public static final String C_MESSAGE = "heiheihei";
    public static final String D_MESSAGE = "hahhah";
    private Map<Student.Grade, String> message;

    public String getMessage(Student.Grade key) {
        return getMessage().get(key);
    }

    private Map<Student.Grade, String> getMessage(){
        if(message == null){
            initMessage();
        }
        return message;
    }

    private void initMessage() {
        message = new EnumMap<Student.Grade, String>(Student.Grade.class);
        message.put(Student.Grade.A, ReportCard.A_MESSAGE);
        message.put(Student.Grade.B,ReportCard.B_MESSAGE);
        message.put(Student.Grade.C,ReportCard.C_MESSAGE);
        message.put(Student.Grade.D,ReportCard.D_MESSAGE);
    }
}
