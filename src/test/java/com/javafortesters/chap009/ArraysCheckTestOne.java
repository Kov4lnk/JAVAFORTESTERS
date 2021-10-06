package com.javafortesters.chap009;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraysCheckTestOne {
    String[] brothers = {"Andy", "Falc", "Tony", "Alig"};

    @Test
    public void checkArray(){
        
//        String names = "";
//        for (String brother : brothers){
//            names = names + " | " + brother;
//        }
//        System.out.println(names);
        
       String names = "";
        for (int i = 0; i < 3; i++) {
            names = names + "|" + i + " - " + brothers[i];
            
        }
        assertEquals("|0 - Andy|1 - Falc|2 - Tony", names);

        System.out.println(names);
    }

}
