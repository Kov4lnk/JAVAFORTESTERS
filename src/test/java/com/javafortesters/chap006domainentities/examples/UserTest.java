package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructNewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("defaultUserNameExpected", "username", user.getUsername());
        assertEquals("defaultUserPasswordExpected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pa55W0rd");
        assertEquals("given username expected", "admin", user.getUsername());
        assertEquals("given password expected", "pa55W0rd", user.getPassword());
    }

}
