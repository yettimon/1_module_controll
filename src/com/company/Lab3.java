/*
 * Lab Work1, Area limited by the following functions
 *
 * Version info 1.0
 *
 * Copyright Stavnichuk Dmytro

 */
package com.company;

public class Lab3 {
    public static void main(String[] args) {
        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double area = 0;
        double y = 0.2;

        for (double x = 0; x < finish; x+=deltaX) {
            double rectangle = 0;
            if(Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            }
            else {
                rectangle = y *deltaX;
            }
            area += rectangle;
        }
        System.out.println(area);
    }
}
