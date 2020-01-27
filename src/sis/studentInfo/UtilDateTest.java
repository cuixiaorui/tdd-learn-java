package sis.studentInfo;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilDateTest extends TestCase {


    public void testUtilDate(){

        Date date = UtilDate.createDate(2000,1,1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        assertEquals(2000,calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY,calendar.get(Calendar.MONTH));
        assertEquals(1,calendar.get(Calendar.DAY_OF_MONTH));
    }
}
