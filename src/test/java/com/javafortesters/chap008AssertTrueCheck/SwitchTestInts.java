package com.javafortesters.chap008AssertTrueCheck;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SwitchTestInts {


    public String numberIs(int num){
        String number;

        switch (num){
                case 1:
                    number = "One";
                    break;
                case 2:
                    number = "Two";
                    break;
                case 3:
                    number = "Three";
                    break;
                case 4:
                    number = "Four";
                    break;
                default:
                    if (num > 4){
                        number = "Too big";
                    }else {
                        number = "Too small";
                    }
                    break;
                }
            return number;
        }

    @Test
    public void SwitchCasesIntsTest(){
        assertEquals("One", numberIs(1));
        assertEquals("Two", numberIs(2));
        assertEquals("Three", numberIs(3));
        assertEquals("Four", numberIs(4));
        assertEquals("Too big", numberIs(6));
        assertEquals("Too small", numberIs(0));


    }


}

