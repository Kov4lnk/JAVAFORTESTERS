package com.javafortesters.chap005testwithourownclasses.domainobject.example;


import org.junit.Test;

import static com.javafortesters.domainobject.TestAppEnv.*;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                getUrl());

    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Domain", "192.123.0.3", DOMAIN);
        assertEquals("Port", "67", PORT);
    }

}
