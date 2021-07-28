package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                                         .mapToInt(Integer::parseInt)
                                         .toArray();

        for (int index = 0; index < numbersArr.length - 1; index++) {

            if (numbersArr[index] > numbersArr[index + 1]) {
                System.out.print(numbersArr[index] + " ");
            }
       }
        System.out.print(numbersArr[numbersArr.length - 1]);
    }
}