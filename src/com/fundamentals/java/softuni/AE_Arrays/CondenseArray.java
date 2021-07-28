package com.fundamentals.java.softuni.AE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

        int sum = 0;
        if (numbersArray.length <= 2){
            for (int n : numbersArray) {
                sum =+ n;
            }
        } else {
            while(numbersArray.length > 2) {
                int[] condensed = new int[numbersArray.length - 1];

                for (int i = 0; i < numbersArray.length - 1; i++) {
                    condensed[i] = numbersArray[i] + numbersArray[i + 1];

                    if (condensed.length == 2){
                        sum += condensed[i];
                    }
                }
                numbersArray = condensed;
            }
        }

        System.out.println(sum);
    }
}