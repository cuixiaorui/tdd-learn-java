package sis.studentInfo;

import junit.framework.TestSuite;
import sis.report.RosterReportTest;

public class AllTests extends TestSuite {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReportTest.class);
        suite.addTestSuite(UtilDateTest.class);
        return suite;
    }
}
