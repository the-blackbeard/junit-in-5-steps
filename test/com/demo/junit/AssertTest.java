package com.demo.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {


    @Test
    public void test() {

        boolean condition = true;
        assertEquals(true,condition);
        assertTrue(condition);
        assertFalse(!condition);
    }
}
