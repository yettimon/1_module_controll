/*
 * Lab Work 1, Harry Potter book
 *
 * Version info 1.1
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LabWork1 {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get(
                "E:\\IdeaProjects\\1_module\\src\\com\\company\\Harry.txt")));
        String HashWords = "";
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
        String[] lines = text.split("\n");
        Integer [] HashCodes = new Integer[text.length()];

        int LineCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longword.length()) {
                longword = words[i];
            }
        }
        System.out.println("The longest word in this text is " + longword);
        System.out.println("It contains "+longword.length()+ " letters");
//        for (int i = 0; i < words.length; i++) {
//            array = (words[i].hashCode());
//        }
        int count = 0;
        int count2;
        int count3;
        int HarryLines =0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry"))
                HarryLines++;
        }
        System.out.println("Word Harry contains in " + HarryLines + " lines");
        System.out.println("Duplicate Hashwords are:");

        for (int i = 0; i < words.length; i++) {
            count2 = 1;
            count3 = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count2++;
                    words[j]= "0";
                }
            }

                HashCodes[i] = words[i].hashCode();
            for (int j1 = i+1; j1 < words.length ; j1++) {
                if(HashCodes[i].equals(HashCodes[j1]))
                {
                    count3++;
                    HashCodes[j1] = 0;
                }
            }
            if (count3 > 1 && HashCodes[i] != 0){
                System.out.println("The word: "+ HashCodes[i] + " repeats "+count3+
                        " times ");
        }
        }
    }
}