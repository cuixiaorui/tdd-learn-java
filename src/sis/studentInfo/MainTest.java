package sis.studentInfo;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest extends TestCase {

    @Test
    public void hello() {
        var main = new Main();
        assertEquals(main.hello(),"Hello world");
    }

    public void testString(){
        String hello = "hello";
        String world = "world";

        assertEquals("helloworld",hello.concat(world));
    }
}