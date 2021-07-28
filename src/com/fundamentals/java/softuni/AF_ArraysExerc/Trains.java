package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0;

        for (int wagon = 1; wagon <= n; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            System.out.print(people + " ");
            sumPeople += people;
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}