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

    }

}
