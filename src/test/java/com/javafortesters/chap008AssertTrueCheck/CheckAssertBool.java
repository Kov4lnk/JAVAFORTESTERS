package com.javafortesters.chap008AssertTrueCheck;

import org.junit.Test;
import org.junit.Assert;

public class CheckAssertBool {
    boolean truthy = true;

/*    @Test
    public void checkAssertBoolOperation(){
        if (truthy == true){
            Assert.assertTrue(truthy);
            System.out.println("Truthy is TRUE");
        }else{
            Assert.assertFalse(truthy);
            System.out.println("Truthy is FALSE");
        }
    }*/
    @Test
    public void checkAssertBoolOperationWithElseCompound(){
        if (truthy == Boolean.TRUE){
            /*Assert.assertTrue(truthy);*/
            Assert.assertFalse(!truthy);
            System.out.println("Truthy is TRUE");
        }else {
            Assert.assertFalse(truthy);
            System.out.println("Truthy is FALSE");
        }
    }




}


