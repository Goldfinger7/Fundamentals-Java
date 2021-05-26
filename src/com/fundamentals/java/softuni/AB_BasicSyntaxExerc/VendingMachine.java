//package com.fundamentals.java.softuni.AB_BasicSyntaxExerc;
//
//import java.util.Scanner;
//
//public class VendingMachine {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String init = scanner.nextLine();
//        String desc = "";
//        double insertedAmount = 0.00;
//        double productPrice = 0.00;
//
//        while (!"Start".equals(init)) {
//            double insertedCoin = Double.parseDouble(init);
//
//            if (insertedCoin == 0.1 || insertedCoin == 0.2 || insertedCoin == 0.5 || insertedCoin == 1 || insertedCoin == 2) {
//                insertedAmount += insertedCoin;
//            } else {
//                System.out.printf("Cannot accept %.2f\n", insertedCoin);
//            }
//
//            init = scanner.nextLine();
//        }
//
//        init = scanner.nextLine();
//
//        while (!"End".equals(init)) {
//
//            switch (init) {
//                case "Nuts":
//                    productPrice = 2.0;
//                    desc = "Purchased Nuts";
//                    break;
//                case "Water":
//                    productPrice = 0.7;
//                    desc = "Purchased Water";
//                    break;
//                case "Crisps":
//                    productPrice = 1.5;
//                    desc = "Purchased Crisps";
//                    break;
//                case "Soda":
//                    productPrice = 0.8;
//                    desc = "Purchased Soda";
//                    break;
//                case "Coke":
//                    productPrice = 1.0;
//                    desc = "Purchased Coke";
//                    break;
//                default:
//                    System.out.print("Invalid product");
//            }
//
//            if (insertedAmount >= productPrice) {
//                insertedAmount = insertedAmount - productPrice;
//                System.out.println(desc);
//            } else {
//                System.out.printf("Sorry, not enough money\n");
//            }
//
//            init = scanner.nextLine();
//        }
//
//        System.out.printf("Change: %.2f", insertedAmount);
//    }
//}