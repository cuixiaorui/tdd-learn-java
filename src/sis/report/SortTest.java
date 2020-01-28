package sis.report;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest extends TestCase {

    public void testSort(){
        ArrayList<String> array = new ArrayList();

        array.add("c");
        array.add("a");
        array.add("b");

        assertEquals("[c, a, b]", array.toString());
        Collections.sort(array);
        assertEquals("[a, b, c]", array.toString());

    }

}
