/*
 * Lab Work 1, Harry Potter book
 *
 * Version info 1
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LabWork1 {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get(
                "E:\\IdeaProjects\\1_module\\src\\com\\company\\Harry.txt")));
        String longword = "";
        String CommonWords = "";
        String[] keyword = {"Harry"};
        String clearedText = text
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("-", " ")
                .replaceAll("!", "")
                .replaceAll("  ", " ")
                .replaceAll("\n", "")
                .replaceAll("\\?", "")
                .toLowerCase()
                .replaceAll("\\.", "");
        String[] words = clearedText.split(" ");


        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longword.length()) {
                longword = words[i];
            }
        }
        System.out.println("The longest word in this text is " + longword);
        System.out.println("It contains "+longword.length()+ " letters");
        System.out.println(words.hashCode());
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].hashCode());
        }
        int count = 0;
        int count2;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("harry"))
                count++;
        }
        System.out.println("Word Harry" + " repeats " + count + " times");
        System.out.println("Duplicate Characters are:");

        for (int i = 0; i < words.length; i++) {
            count2 = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count2++;
                    words[j] = "0";
                }
            }
            if (count2 > 1 && words[i] != "0")
                System.out.println("The word: "+ words[i]+ " repeats "+count2+
                        " times ");
        }
    }
}