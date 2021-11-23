//package com.fundamentals.java.softuni.AA_BasicSyntax;
//
//import java.util.Scanner;
//
//public class TheatrePromotion {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String dayType = scanner.nextLine();
//        double age = Double.parseDouble(scanner.nextLine());
//        int ticketPrice = 0;
//
//        switch (dayType) {
//            case "Weekday":
//                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
//                    ticketPrice = 12;
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 18;
//                } else {
//                    System.out.println("Error!");
//                }
//            break;
//            case "Weekend":
//                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
//                    ticketPrice = 15;
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 20;
//                }else {
//                    System.out.println("Error!");
//                }
//                break;
//            case "Holiday":
//                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
//                    ticketPrice = 5;
//                } else if (age > 18 && age <= 64) {
//                    ticketPrice = 12;
//                } else {
//                    System.out.println("Error!");
//                }
//                break;
//            default:
//                System.out.println("Error!");
//        }
//
//        if (ticketPrice != 0) {
//            System.out.printf("%d$", ticketPrice);
//        }
//    }
//}