package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int firstN = Integer.parseInt(input.split(" ")[0]);
            int secondN = Integer.parseInt(input.split(" ")[1]);

            if ((i + 1) % 2 == 0) {
                firstArray[i] = secondN;
                secondArray[i] = firstN;
            } else {
                firstArray[i] = firstN;
                secondArray[i] = secondN;
            }
        }

        for (int n1 : firstArray) {
            System.out.print(n1 + " ");
        }
        System.out.println();
        for (int n2 : secondArray) {
            System.out.print(n2 + " ");
        }
    }
}