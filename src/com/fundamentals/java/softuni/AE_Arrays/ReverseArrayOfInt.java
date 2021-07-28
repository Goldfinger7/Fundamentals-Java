package com.fundamentals.java.softuni.AE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfInt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }



//        String names = "Gosho Pesho Martin";
//        String[] namesArray = names.split(" ");
//
//        String backToString = String.join(" ", namesArray);
//
//        String[] abc = {"Marko", "Pencho", "Danyo"};
//        System.out.println(String.join(" && ", abc));



            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println(String.join(" ", input));
    }
}
