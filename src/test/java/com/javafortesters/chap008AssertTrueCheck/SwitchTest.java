package com.javafortesters.chap008AssertTrueCheck;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwitchTest {

    public String shortNameIs(String title){
        String shortName;

        switch (title.toLowerCase()){
            case "uk" :
                shortName = "United Kingdom";
                break;
            case "us" :
                shortName = "United States";
                break;
            case "usa" :
                shortName = "United States of America";
                break;
            case "fr" :
                shortName = "France";
                break;
            case "sw" :
                shortName = "Sweden";
                break;
            default:
                shortName = "Rest of the World";
                break;
        }
        return shortName;
    }

    @Test
    public void SwitchCasestest(){
        assertEquals("United Kingdom" , shortNameIs("Uk"));
        assertEquals("United Kingdom" , shortNameIs("uk"));
        assertEquals("United Kingdom" , shortNameIs("UK"));
        assertEquals("United Kingdom" , shortNameIs("uK"));

    }
}
