package com.fundamentals.java.softuni.AE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int currentDay = Integer.parseInt(scanner.nextLine());
//
//        String[] days = {
//                "Monday",
//                "Tuesday",
//                "Wednesday",
//                "Thursday",
//                "Friday",
//                "Saturday",
//                "Sunday"
//        };
//        if (currentDay >= 1 && currentDay <= 7) {
//            System.out.println(days[currentDay - 1]);
//        } else {
//            System.out.println("Invalid day!");
//        }
//
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbersArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbersArray[i] = Integer.parseInt(inputArray[i]);
        }

        int[] arr = Arrays.stream(inputArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        System.out.println();
    }
}
