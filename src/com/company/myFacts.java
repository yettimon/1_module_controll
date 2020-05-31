/*
 * Lab Work, Facts About me
 *
 * Version info 1.0
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

public class myFacts {
    public static void main(String[] args) {
        byte myAge = 21;
        short myBirthYear = 1998;
        int myWishedSalary = 10000;
        long mySomething = 1000000l;
        char myAverageMark = 'C';
        float myHeight = 1.76f;
        double myBirthDay = 12.08;
        boolean isStudent = true;
        String AboutMyself = " Hello, my name is Dmitriy and my age is "
                + myAge +" years. I was born in "+ + myBirthYear + "\n" +
                " My wished salary is " + myWishedSalary + "\n" +
                " My favourite number is " + mySomething + "\n" +
                " My average mark in CHNU " + myAverageMark + "\n" +
                " My height " + myHeight + "\n" +
                " My birthday date " + myBirthDay + "\n" +
                " Am i a student? " + isStudent + "\n";
        System.out.println(AboutMyself);
        System.out.println("This text length is " + AboutMyself.length());
    }
}
