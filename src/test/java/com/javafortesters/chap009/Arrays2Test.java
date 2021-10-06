package com.javafortesters.chap009;

public class Arrays2Test {
    public static void main(String[] args) {
        String[] users = new String[100];

        int userIndex = 1;
        for (String user: users){
            String userName = "username" + userIndex;
            String passWord = "password" + userIndex;
            users[userIndex] = userName + passWord;
            System.out.println(user);
            userIndex++;
        }
    }

/*    @Test
    public void someAssertCodeToCheck(){
        *//*assertEquals("username1password1", users);*//*
    }*/

}
