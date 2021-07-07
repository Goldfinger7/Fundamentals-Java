package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//        int sum = 0;
//
//        for (int i = 0; i < number.length(); i++) {
//            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
//            sum += digit;
//        }
//        System.out.println(sum);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println(sum);
    }
}