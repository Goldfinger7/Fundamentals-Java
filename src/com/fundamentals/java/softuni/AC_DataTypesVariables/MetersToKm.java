package com.fundamentals.java.softuni.AC_DataTypesVariables;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int variable = Integer.parseInt(scanner.nextLine());
//        double km = 1.0 * variable / 1000;
//        System.out.printf("%.2f", km);
//    }

//    ============================

//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double variable = Double.parseDouble(scanner.nextLine());
//        double dollars = variable * 1.31;
//        System.out.printf("%.3f", dollars);
//    }

//  ==========================================

import java.math.BigDecimal;
import java.util.Scanner;

public class MetersToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i < n ; i++) {
            BigDecimal currentNumb = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNumb);
        }

        System.out.println(sum);
    }

}