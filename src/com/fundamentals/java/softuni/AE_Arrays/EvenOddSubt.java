package com.fundamentals.java.softuni.AE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");

        int[] numbersArr = Arrays.stream(inputArray)
                                 .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number: numbersArr) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

//        System.out.println(evenSum - oddSum);
        System.out.println(evenSum);
    }
}