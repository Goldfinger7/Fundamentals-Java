package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class IntegerOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int sum = n1 + n2;
        int dividedSum = sum / n3;
        int finalSum = dividedSum * n4;
        System.out.println(finalSum);
    }
}
