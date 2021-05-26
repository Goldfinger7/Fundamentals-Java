//package com.fundamentals.java.softuni.AA_BasicSyntax;
//
//import java.util.Scanner;
//
//public class BackIn30Min {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int hours = Integer.parseInt(scanner.nextLine());
//        int minutes = Integer.parseInt(scanner.nextLine());
//
//        minutes = minutes + 30;
//        if (minutes >= 60) {
//            minutes = minutes - 60;
//            hours++;
//            if (hours >= 24) {
//                hours = 0;
//            }
//        }
//
//        String result = String.format("%d:%02d", hours, minutes);
//        System.out.println(result);
//    }
//}