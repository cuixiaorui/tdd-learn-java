package chess;
import junit.framework.TestSuite;

public class AllTests {
    public static TestSuite suite(){
        junit.framework.TestSuite suite = new TestSuite();
        suite.addTestSuite(BoardTest.class);
        suite.addTestSuite(PawnTest.class);
        return suite;
    }
}
