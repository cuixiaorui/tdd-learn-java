package sis.studentInfo;

import junit.framework.TestCase;

public class ScorerTest extends TestCase {
    public void testCaptureScore(){
        Scorer scorer = new Scorer();
        assertEquals(75,scorer.score("75"));
    }

    public void testBadScoreEntered(){
        try{
            Scorer scorer = new Scorer();
            assertEquals(75,scorer.score("abc"));
            fail("expected NumberFormatException on bad input");
        }catch (NumberFormatException success){

        }
<<<<<<< HEAD
    }

    public void testIsValid(){
        Scorer scorer = new Scorer();
        assertTrue(scorer.isValid("123"));
        assertFalse(scorer.isValid("abc"));
    }


=======

    }

>>>>>>> c1d149438a3edee88df853acf17043562b82bd40
}
