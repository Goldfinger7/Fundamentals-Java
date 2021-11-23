//package com.fundamentals.java.softuni.AC_BasicSyntaxExercMore;
//
//import java.util.Scanner;
//
//public class SortingNumbers {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = Integer.parseInt(input.nextLine());
//        int b = Integer.parseInt(input.nextLine());
//        int c = Integer.parseInt(input.nextLine());
//
//        // Sort the numbers
//        int min, max, med;
//
//        if (a > b) {
//            if (a > c) {
//                max = a;
//                if (b > c) {
//                    med = b;
//                    min = c;
//                } else {
//                    med = c;
//                    min = b;
//                }
//            } else {
//                med = a;
//                if (b > c) {
//                    max = b;
//                    min = c;
//                } else {
//                    max = c;
//                    min = b;
//                }
//            }
//        } else {
//            if (b > c) {
//                max = b;
//                if (a > c) {
//                    med = a;
//                    min = c;
//                } else {
//                    med = c;
//                    min = a;
//                }
//            } else {
//                med = b;
//                max = c;
//                min = a;
//            }
//        }
//
//        //Display results
//        System.out.println(max);
//        System.out.println(med);
//        System.out.println(min);
//    }
//
//}