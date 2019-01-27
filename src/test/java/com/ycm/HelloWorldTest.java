package com.ycm;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void RunTest() {
        HelloWorld h = new HelloWorld();
        String str = "World";

        assertEquals(str, h.hello(str));
    }
}