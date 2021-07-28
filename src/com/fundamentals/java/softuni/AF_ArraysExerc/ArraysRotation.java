package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Scanner;

public class ArraysRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArr = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countRotations; i++) {
            // save first element
            String temp = numbersArr[0];

            // shift all elements to the left with one index
            for (int index = 0; index < numbersArr.length - 1; index++) {
                numbersArr[index] = numbersArr[index + 1];
            }
            //             System.arraycopy(numbersArr, 1, numbersArr, 0, numbersArr.length - 1);

            // save the first element to the last position
            numbersArr[numbersArr.length - 1] = temp;
        }

        System.out.println(String.join(" ", numbersArr));
//        for (String number : numbersArr) {
//            System.out.print(number + " ");
//        }
    }
}