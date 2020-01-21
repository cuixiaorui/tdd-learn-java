package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void hello() {
        var main = new Main();
        assertEquals(main.hello(),"Hello world");
    }
}