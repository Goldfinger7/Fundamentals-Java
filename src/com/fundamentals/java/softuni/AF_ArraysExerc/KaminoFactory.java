package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int maxLength = 0; // максимална дължина на определена поредица
        int length = 1; // дължината на дадена поредица

        int startIndex = 0; // буфер за стартов индекс на поредица
        int bestStart = 0; // стартов индекс на поредица

        int maxSum = 0; // сума на поредицата
        int sum = 0; // сума на current поредица


        while (!"Clone them!".equals(input)) {

            // разделям стринга в масив
            int[] dnaArray = Arrays.stream(input.split("!"))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();

            // събирам сумата от елементите
            for (int symbol : dnaArray) {
                sum += symbol;
            }

            // ако текущата сума е по-голяма от макс. сума
            if (sum > maxSum) {
                maxSum = sum;
            }

            for (int i = 1; i < dnaArray.length; i++) {
                if (dnaArray[i] == (dnaArray[i - 1])) {
                    length++;
                } else {
                    length = 1;
                    startIndex = i;
                }

                if (length > maxLength) {
                    maxLength = length;
                    bestStart = startIndex;
                }
            }

//            for (int i = bestStart; i < bestStart + maxLength; i++) {
//                System.out.print(dnaArray[i] + " ");
//            }

            input = scanner.nextLine();
        }
    }
}
