/*
 * Lab Work, Palindrome check
 *
 * Version info 1.0
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

public class Lab3Palindrome {
    public static void main(String[] args) {
        String Palindromes = "Лег на храм, и дивен и невидим архангел";
//        String Palindromes = "Морда казака за кадром";
//        String Palindromes = "Не женат, а нежен";
//        String Palindromes = "Мак чужд жучкам.";
//        String Palindromes = "«Откопать тапок-то?";
//        All this palindromes checked and everything worked
        Palindromes = Palindromes.toLowerCase()
                .replaceAll("[^A-Za-z0-9_А-Яа-я]", "");

        String palindromeCheck ="";
        for (int i = 0; i < Palindromes.length() ; i++) {
            int index = Palindromes.length() - i -1;
            palindromeCheck += Palindromes.charAt(index);
        }
        System.out.println(palindromeCheck);

        if (Palindromes.equals(palindromeCheck)){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }
        }
    }
