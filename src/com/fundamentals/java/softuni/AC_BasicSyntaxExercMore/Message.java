//package com.fundamentals.java.softuni.AC_BasicSyntaxExercMore;
//
//import java.util.Scanner;
//
//public class Message {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        for (int i = 1; i <= number; i++) {
//            String command = input.nextLine();
//
//            if (command.equals("0")) {
//                System.out.print((char) 32);
//                continue;
//            }
//
//            int countDigits = command.length();
//            int mainDigit = Integer.parseInt(command) % 10;
//            int offset = (mainDigit - 2) * 3;
//
//            if (mainDigit == 8 || mainDigit == 9) {
//                offset++;
//            }
//
//            int letterIndex = (offset + countDigits - 1);
//            int asciiCode = 97 + letterIndex;
//
//            System.out.print((char) asciiCode);
//        }
//
//    }
//}