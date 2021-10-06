package com.javafortesters.chap0010CollectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CheckCollectionTask {


    @Test
    public void checkTask1(){
        Collection<String> users = new ArrayList<>();
        assertEquals("size is 0", 0, users.size());
        assertTrue("it really empty", users.isEmpty());

        users.add("Peter");
        users.add("Voland");
        assertEquals("there are 2 users already", 2, users.size());
        assertFalse("Really - two", users.isEmpty());

        Collection<String> partners = new ArrayList<>();
        partners.add("Josef");
        partners.add("Jay");
        users.addAll(partners);
        assertEquals(4, users.size());
        assertTrue(users.containsAll(partners));

        partners.removeAll(partners);
        assertEquals(0, partners.size());
        assertTrue(partners.isEmpty());

        users.clear();
        assertEquals(0, users.size());
        assertTrue(users.isEmpty());


    }

/*    @Test
    public void checkTask2(){

    }


    @Test
    public void checkTask3(){

    }*/
}
