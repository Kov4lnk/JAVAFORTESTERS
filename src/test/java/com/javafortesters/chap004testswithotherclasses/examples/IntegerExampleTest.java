package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public void integerExploration(){
/*        Integer four = new Integer(4);
        assertEquals("Int value returns 4", 4, four.intValue());*/

/*        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());*/

/*        Integer eleven = 11;
        assertEquals("test", "b", eleven.toHexString(eleven));*/

/*
        int ten = 10;
        assertEquals("test", "a", Integer.toHexString(ten));
*/

/*        int three = 3;
        assertEquals("test", "3", Integer.toHexString(three));*/

/*        int twenty_one = 21;
        assertEquals("test", "15", Integer.toHexString(twenty_one));*/

/*        int maxValue = 2147483647;
        assertEquals("Check the correspondence", 2147483647 , Integer.MAX_VALUE );*/

        int minValue = -2147483648;
        assertEquals("Check the correspondence", -2147483648 , Integer.MIN_VALUE);
    }
}
