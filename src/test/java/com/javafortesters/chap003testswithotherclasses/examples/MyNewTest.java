package com.javafortesters.chap003testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyNewTest {
    @Test
    public void AddTwoPlusTwo(){
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }
}

