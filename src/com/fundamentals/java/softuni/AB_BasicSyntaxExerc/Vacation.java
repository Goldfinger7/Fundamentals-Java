//package com.fundamentals.java.softuni.AB_BasicSyntaxExerc;
//
//import java.util.Scanner;
//
//public class Vacation {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int countGroup = Integer.parseInt(scanner.nextLine());
//        String groupType = scanner.nextLine();
//        String day = scanner.nextLine();
//        double price = 0.00;
//        double totalPrice = 0.00;
//
//        switch (day) {
//            case "Friday":
//                if ("Students".equals(groupType)) {
//                    price = 8.45;
//                } else if ("Business".equals(groupType)) {
//                    price = 10.90;
//                } else if ("Regular".equals(groupType)) {
//                    price = 15;
//                }
//                break;
//            case "Saturday":
//                if ("Students".equals(groupType)) {
//                    price = 9.80;
//                } else if ("Business".equals(groupType)) {
//                    price = 15.60;
//                } else if ("Regular".equals(groupType)) {
//                    price = 20;
//                }
//                break;
//            case "Sunday":
//                if ("Students".equals(groupType)) {
//                    price = 10.46;
//                } else if ("Business".equals(groupType)) {
//                    price = 16;
//                } else if ("Regular".equals(groupType)) {
//                    price = 22.50;
//                }
//                break;
//        }
//
//        totalPrice = countGroup * price;
//
//        if ("Students".equals(groupType) && countGroup >= 30) {
//            totalPrice -= (totalPrice * 0.15);
//        }
//
//        if ("Business".equals(groupType) && countGroup >= 100) {
//            totalPrice -= (price * 10);
//        }
//
//        if ("Students".equals(groupType) && countGroup >= 10 && countGroup <= 20) {
//            totalPrice -= (totalPrice * 0.05);
//        }
//
//        System.out.printf("Total price: %.2f", totalPrice);
//    }
//}
//
//import java.util.Scanner;
//
//public class Vacation {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int quantity = Integer.parseInt(scanner.nextLine());
//        String group = scanner.nextLine();
//        String day = scanner.nextLine();
//        double price = 0;
//
//        if (group.equals("Students")) {
//            switch (day) {
//                case "Friday":
//                    price = quantity * 8.45;
//                    break;
//                case "Saturday":
//                    price = quantity * 9.80;
//                    break;
//                case "Sunday":
//                    price = quantity * 10.46;
//                    break;
//            }
//            if (quantity >=30){
//                price = price * 0.85;
//
//            }
//        } else if (group.equals("Business")) {
//            if (quantity >=100) {
//                quantity -= 10;
//            }
//            switch (day) {
//                case "Friday":
//                    price = quantity * 10.90;
//                    break;
//                case "Saturday":
//                    price = quantity * 15.60;
//                    break;
//                case "Sunday":
//                    price = quantity * 16.00;
//                    break;
//            }
//        } else if (group.equals("Regular")){
//            switch (day) {
//                case "Friday":
//                    price = quantity * 15.00;
//                    break;
//                case "Saturday":
//                    price = quantity * 20.00;
//                    break;
//                case "Sunday":
//                    price = quantity * 22.50;
//                    break;
//            }
//            if (quantity >=10 && quantity<=20){
//                price = price * 0.95;
//            }
//        }
//        System.out.printf("Total price: %.2f",price);
//
//
//    }
//}