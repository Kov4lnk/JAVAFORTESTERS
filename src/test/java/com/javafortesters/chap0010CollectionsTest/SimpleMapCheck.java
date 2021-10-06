package com.javafortesters.chap0010CollectionsTest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SimpleMapCheck {

    @Test
    public void checkMapSimple(){
        Map<String, String> users = new HashMap<>();
        users.put("name1","Vasys");
        users.put("name2","Petys");
        users.put("name2","Dudya");

        assertEquals(2, users.size());
        System.out.println(users.size());
    }
}
