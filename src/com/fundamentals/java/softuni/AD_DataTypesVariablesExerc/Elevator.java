package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int limit = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((people * 1.0) / limit);
        System.out.printf("%.0f", courses);
    }
}
