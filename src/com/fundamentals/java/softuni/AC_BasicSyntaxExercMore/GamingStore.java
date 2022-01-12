//package com.fundamentals.java.softuni.AC_BasicSyntaxExercMore;
//
//import java.util.Scanner;
//
//public class GamingStore {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double balance = Double.parseDouble(input.nextLine());
//        String operation = input.nextLine();
//
//        double priceTag = 0.00;
//        double sumOfProducts = 0.00;
//        boolean tooExpensive = false;
//        boolean outOfMoney = false;
//
//        while (!"Game Time".equals(operation)) {
//
//            switch (operation) {
//                case "OutFall 4":
//                case "RoverWatch Origins Edition":
//                    priceTag = 39.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                        tooExpensive = true;
//                    } else {
//                        System.out.println("Bought " + operation);
//                        tooExpensive = false;
//                    }
//                    break;
//                case "CS: OG":
//                    priceTag = 15.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                        tooExpensive = true;
//                    } else {
//                        System.out.println("Bought " + operation);
//                        tooExpensive = false;
//                    }
//                    break;
//                case "Zplinter Zell":
//                    priceTag = 19.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                        tooExpensive = true;
//                    } else {
//                        System.out.println("Bought " + operation);
//                        tooExpensive = false;
//                    }
//                    break;
//                case "Honored 2":
//                    priceTag = 59.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                        tooExpensive = true;
//                    } else {
//                        System.out.println("Bought " + operation);
//                        tooExpensive = false;
//                    }
//                    break;
//                case "RoverWatch":
//                    priceTag = 29.99;
//                    if (priceTag > balance) {
//                        System.out.println("Too Expensive");
//                        tooExpensive = true;
//                    } else {
//                        System.out.println("Bought " + operation);
//                        tooExpensive = false;
//                    }
//                    break;
//                default:
//                    System.out.println("Not Found");
//                    tooExpensive = false;
//                    break;
//            }
//
//            if (Boolean.FALSE.equals(tooExpensive)) {
//                balance -= priceTag;
//                sumOfProducts += priceTag;
//            }
//
//            if (balance <= 0.00) {
//                System.out.println("Out of money!");
//                outOfMoney = true;
//                break;
//            }
//
//            operation = input.nextLine();
//        }
//
//        if (Boolean.FALSE.equals(outOfMoney)) {
//            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sumOfProducts, balance);
//        }
//
//    }
//}