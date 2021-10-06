package com.javafortesters.chap008AssertTrueCheck;

import org.junit.Assert;
import org.junit.Test;

public class NestedIfElseHorror {
    boolean truthy = false;
    boolean falsey = true;

    @Test
    public void checkIfElseNested(){
        if (truthy){
            if (!falsey){
                if (truthy && !falsey){
                    if (truthy || falsey){
                        Assert.assertTrue(truthy);
                        Assert.assertFalse(falsey);
                        System.out.println(truthy + " OR " + falsey);
                    }
                    System.out.println("Truthy is TRUE and !falsey is true");
                }
                System.out.println("!falsey is TRUE");
            }else{
                Assert.assertTrue(truthy);
                Assert.assertTrue(falsey);
                System.out.println("!falsey is FALSE (falsey is TRUE)");

            }
            System.out.println("truthy is TRUE");
        }else{
            if (!truthy){
                if (falsey){
                    Assert.assertTrue(falsey);
                    Assert.assertFalse(truthy);
                    System.out.println("Falsey is TRUE");
                }else{
                    Assert.assertFalse(falsey);
                    Assert.assertFalse(truthy);
                    System.out.println("Falsey is FALSE");
                }
                System.out.println("!Truthy is TRUE");
            }
            System.out.println("Truthy is FALSE");
        }
    }
}

