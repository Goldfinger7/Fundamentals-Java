package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                                         .mapToInt(Integer::parseInt)
                                         .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbersArr.length; index++) {
            for (int i = index + 1; i < numbersArr.length; i++) {
                if ((numbersArr[index] + numbersArr[i]) == magicNumber) {
                    System.out.println(numbersArr[index] + " " + numbersArr[i]);
                }
            }

        }
    }
}