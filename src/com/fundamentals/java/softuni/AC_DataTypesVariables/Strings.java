package com.fundamentals.java.softuni.AC_DataTypesVariables;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s1 = scanner.nextLine().charAt(0);
        char s2 = scanner.nextLine().charAt(0);
        char s3 = scanner.nextLine().charAt(0);

        String abc = String.valueOf(s3 + ' ' + s2 + ' ' + s1);
        System.out.println(abc);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        char s1 = scanner.nextLine().charAt(0);
//        char s2 = scanner.nextLine().charAt(0);
//        char s3 = scanner.nextLine().charAt(0);
//
//        String abc = String.valueOf(s1 + s2 + s3);
//        System.out.println(abc);
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        String s3 = scanner.nextLine();
//
//        String abc = String.format(s1.concat(s3).concat(s2));
//        System.out.println(abc);
//    }


//     public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            String city = scanner.nextLine();
//            int population = Integer.parseInt(scanner.nextLine());
//            int area = Integer.parseInt(scanner.nextLine());
//
//            System.out.printf("Town %s has population of %d and area %d square km.", city, population, area);
//        }
}
