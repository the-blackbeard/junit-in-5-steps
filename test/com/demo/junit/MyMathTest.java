package com.demo.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void sum_with3numbers() {
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
    }

    @Test
    public void sum_with1numbers() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[] {3}));
    }
}
