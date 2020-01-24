package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void hello() {
        var main = new Main();
        assertEquals(main.hello(),"Hello world");
    }
}