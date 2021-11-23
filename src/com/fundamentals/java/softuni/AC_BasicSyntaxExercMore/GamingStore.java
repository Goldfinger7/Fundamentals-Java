//package com.fundamentals.java.softuni.AC_BasicSyntaxExercMore;
//
//import java.util.Scanner;
//
//public class GamingStore {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double balance = Double.parseDouble(input.nextLine());
//
//        String operation = input.nextLine();
//        double sum = 0.00;
//        double priceTag = 0.00;
//        double sumProducts = 0.00;
//        boolean isOutOfMoney = false;
//
//        while (!operation.equals("Game Time")) {
//
//            switch (operation) {
//                case "OutFall 4":
//                case "RoverWatch Origins Edition":
//                    priceTag = 39.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//
//                    } else {
//                        System.out.println("Bought " + operation);
//                        sum = priceTag;
//                    }
//                    break;
//                case "CS: OG":
//                    priceTag = 15.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                    } else {
//                        System.out.println("Bought " + operation);
//                        sum = priceTag;
//                    }
//                    break;
//                case "Zplinter Zell":
//                    priceTag = 19.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                    } else {
//                        System.out.println("Bought " + operation);
//                        sum = priceTag;
//                    }
//                    break;
//                case "Honored 2":
//                    priceTag = 59.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                    } else {
//                        System.out.println("Bought " + operation);
//                        sum = priceTag;
//                    }
//                    break;
//                case "RoverWatch":
//                    priceTag = 29.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                    } else {
//                        System.out.println("Bought " + operation);
//                        sum = priceTag;
//
//                    }
//                    break;
//                default:
//                    System.out.println("Not Found");
//            }
//
//            balance -= sum;
//            sumProducts += sum;
//
//            if (balance <= 0.00) {
//                System.out.println("Out of money!");
//                isOutOfMoney = true;
//                break;
//            }
//
//            operation = input.nextLine();
//        }
//
//        if (Boolean.FALSE.equals(isOutOfMoney)) {
//            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sumProducts, balance);
//        }
//
//    }
//}