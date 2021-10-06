package com.javafortesters.chap009;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysCheck1 {

    String[] workdays = {"monday", "Tuesday", "wednesday", "Thursday", "Friday"};

    @Test
    public void checker() {

        for (int i = 0; i < workdays.length; i++) {
            workdays[i] = workdays[i].toLowerCase();
        }
        Arrays.sort(workdays);
        for (int i = 0; i < 5; i++) {
            System.out.println(workdays[i]);
        }

        assertEquals("friday", workdays[0]);
        assertEquals("monday", workdays[1]);
        assertEquals("thursday", workdays[2]);
        assertEquals("tuesday", workdays[3]);
        assertEquals("wednesday", workdays[4]);
    }
}
