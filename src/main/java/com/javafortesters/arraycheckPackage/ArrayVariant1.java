package com.javafortesters.arraycheckPackage;

import java.util.Arrays;

public class ArrayVariant1 {
        public String[] workdays;
        public static void arrayModify(){
            String[] workdays = {"monday", "Tuesday", "wednesday", "Thursday", "Friday"};
            for (int i = 0; i < workdays.length; i++) {
                workdays[i] = workdays[i].toLowerCase();
            }
            Arrays.sort(workdays);
            for (int i = 0; i < 5; i++) {
                System.out.println(workdays[i]);
            }

        }


}
