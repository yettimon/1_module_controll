/*
 * Harry Potter Lab
 *
 * Version info 1.0
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry_Potter {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(
                "E:\\IdeaProjects\\1_module\\src\\com\\company\\Harry.txt")));
        String clearedText = text
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("-", " ")
                .replaceAll("!", "")
                .replaceAll("  ", " ")
                .replaceAll("\n", "")
                .replaceAll("\\?", "")
                .toLowerCase()
                .replaceAll("\\.", "")
                .replaceAll("'", "")
                .replaceAll("()", "");

        String[] words = clearedText.split(" ");
        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "0";
                }
                else {
                    break;
                }
            }
            if (words[i] != "0") {
                System.out.println("Sorted distinct words: " + words[i] + " ");
            }
        }
    }
}
