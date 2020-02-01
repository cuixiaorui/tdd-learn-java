package sis.studentInfo;

public class Scorer {
    public int score(String input) {
        return Integer.parseInt(input);
    }

<<<<<<< HEAD
    public boolean isValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
=======
>>>>>>> c1d149438a3edee88df853acf17043562b82bd40
}
