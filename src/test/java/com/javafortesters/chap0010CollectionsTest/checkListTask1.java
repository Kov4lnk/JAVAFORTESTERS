package com.javafortesters.chap0010CollectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class checkListTask1 {

    @Test
    public void checkListMethod(){
        List<String> myListOfUsers = new ArrayList<>();
        myListOfUsers.add("Ron");
        assertEquals(1, myListOfUsers.size());
        myListOfUsers.add(0, "Phil");
        assertEquals(0, myListOfUsers.indexOf("Phil"));
        assertEquals(1, myListOfUsers.indexOf("Ron"));
        System.out.println(myListOfUsers.get(0));
        System.out.println(myListOfUsers.get(1));
        System.out.println("====================");

        myListOfUsers.remove(0);
        assertEquals(0, myListOfUsers.indexOf("Ron"));
        assertEquals(1, myListOfUsers.size());
        System.out.println(myListOfUsers.get(0));

    }
}
