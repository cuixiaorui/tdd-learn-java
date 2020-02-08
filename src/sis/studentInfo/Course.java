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
        if(object == null)return false;

        if(object.getClass() != this.getClass()){
            return false;
        }

        return this.getDepartment() == ((Course)object).getDepartment() &&
               this.getNumber() == ((Course)object).getNumber();
    }


    @Override
    public int hashCode(){
       final int hashMultiplier = 41;
       int result = 7;
       result = result * hashMultiplier + department.hashCode() + number;
       return result;
    }
}
