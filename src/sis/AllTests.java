package sis;

import junit.framework.TestSuite;

public class AllTests extends TestSuite {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(sis.report.AllTests.suite());
        suite.addTest(sis.studentInfo.AllTests.suite());
        return suite;
    }
}
