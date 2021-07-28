package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class _MaxSequenceInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(e -> Integer.parseInt(e))
                            .toArray();

        int maxLength = 0; // максимална дължина на определена поредица
        int length = 1; // дължината на дадена поредица

        int startIndex = 0; // буфер за стартов индекс на поредица
        int bestStart = 0; // стартов индекс на поредица

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]) { // ако текущия е равен на предходния
                length++; // увеличи дължината на поредицата
            } else { // иначе ресетни всико
                length = 1;
                startIndex = i; // след като нямаме два поредни - ресетваме стартовият индекс на текущият
            }

            if(length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}