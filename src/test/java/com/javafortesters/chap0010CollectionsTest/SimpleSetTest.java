package com.javafortesters.chap0010CollectionsTest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SimpleSetTest {

    @Test
    public void checkSimpleSet(){
        Set<String> users = new HashSet<>();

        users.add("Peter");
        users.add("Peter");
        users.add("Peter");
        assertEquals(1, users.size());
    }
}
