package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;

        while (yield >= 100) {
            int workedSpice = yield - 26;
            totalAmount += workedSpice;
            yield -= 10;
            days++;
        }

        System.out.println(days);
        if (totalAmount >= 26) {
            totalAmount -= 26;
        }
        System.out.println(totalAmount);
    }
}
