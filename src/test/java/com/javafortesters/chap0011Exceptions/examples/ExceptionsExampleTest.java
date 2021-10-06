package com.javafortesters.chap0011Exceptions.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {

/*    @Test
    public void throwANullPointerException(){
        Integer age=18;*//*previously the value was null and that is why the NullPointerExeption was presented*//*
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }*/

    @Test
    public void catchNullPointerException(){
        Integer age=null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
            System.out.println("getMessage - " +
                    e.getMessage());
            System.out.println("getStacktrace - " +
                    e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();
        }
        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }
}
