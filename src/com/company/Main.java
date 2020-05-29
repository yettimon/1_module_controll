/*
    * Classname Main
    *
    * Version info 1
    *
    * Copyright Stavnichuk Dmytro

 */
package com.company;

public class Main {

    public static void main(String[] args) {
	byte myAge;
        System.out.println();
	short myBirthDate;
        System.out.println();
	int myWishedSalary;
        System.out.println();
	long mySomething;
        System.out.println();
	char e;
        System.out.println();
	float f;
        System.out.println();
	double g;
        System.out.println();
	boolean isStudent;

	System.out.println();
        String[] words = new String[10];
        words[0] = "Hello";
        words[1] = "mama";
        words[2] = "Washed";
        words[3] = "Cleanedm";
        words[4] = "frame";
        words[5] = "2zxc";
        words[6] = "asd";
        words[7] = "cc";
        words[8] = "xx";
        words[9] = "z";

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("a") && words[i].contains("m") && words[i].length() > 5)
            {
                System.out.println(i + ". " + words[i] + " - " + words[i].length() + " symbols");
            }
        }
    }
}
