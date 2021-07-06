package com.fundamentals.java.softuni.AC_DataTypesVariables;

import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int num = 1; num <= n; num++) {
//            int digits = num;
//            int sum = 0;
//
//            while (digits > 0) {
//                int currentDigit = digits % 10;
//                sum += currentDigit;
//                digits /= 10;
//            }
//
//            if (sum == 5 || sum == 7 || sum == 11) {
//                System.out.println(num + " -> True");
//            } else {
//                System.out.println(num + " -> False");
//            }
//        }
//    }
//}

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Boolean isSpecial = false;

        for (int num = 1; num <= n; num++) {
            int digit = num;
            int sum = 0;

            while (digit > 0) {
                int currentDigit = digit % 10;
                sum += currentDigit;
                digit /= 10;
            }

            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            String output = String.valueOf(isSpecial);
            String firstLtr = output.substring(0, 1);
            String restLtrs = output.substring(1);
            firstLtr = firstLtr.toUpperCase();
            output = firstLtr + restLtrs;
            System.out.printf("%d -> %s%n", num, output);
        }
    }
}