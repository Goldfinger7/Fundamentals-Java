package com.fundamentals.java.softuni.AD_DataTypesVariablesExerc;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = Integer.parseInt(scanner.nextLine());

        for (char letter1 = 'a'; letter1 < 'a' + variable ; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + variable ; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' + variable ; letter3++) {
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }

        }
//        int endPrint = 97 + variable;
//
//        for (int i = 97; i < endPrint ; i++) {
//            for (int j = 97 ; j < endPrint; j++) {
//                for (int k = 97; k < endPrint; k++) {
//                    char firstChar = (char)i;
//                    char secondChar = (char)j;
//                    char thirdChar = (char)k;
//                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
//                }
//
//            }
//
//        }
    }
}