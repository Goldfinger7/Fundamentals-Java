package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class WaterOverflow {
//    public static final int VOLUME = 255;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currentLiters = 0;

        for (int i = 1; i <= n; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            currentLiters += pouredLiters;
            if(currentLiters > capacity) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLiters;
            }
        }

        System.out.println(currentLiters);
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        double fill = 0.00;
//
//        for (int i = 0; i < n; i++) {
//            double input = Double.parseDouble(scanner.nextLine());
//            if (fill + input < VOLUME) {
//                fill += input;
//            } else {
//                System.out.println("Insufficient capacity!");
//            }
//        }
//        System.out.printf("%.0f", fill);
    }
}