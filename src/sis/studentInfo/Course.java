package sis.studentInfo;

public class Course {

    private String department;
    private int number;

    public Course(String department, int number) {
        this.department = department;
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object object){
        return this.getDepartment() == ((Course)object).getDepartment() &&
               this.getNumber() == ((Course)object).getNumber();
    }
}
