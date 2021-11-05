package com.fundamentals.java.softuni.AF_ArraysExerc;

import java.util.Arrays;
import java.util.Scanner;

public class Kamino2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход от конзолата:
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int rowsCounter = 0;
        int printRow = 0;

        int currentSequenceSum = 0;
        int greatestSum = 0;

        int currentSequence = 1;
        int greatestSequence = length;

        StringBuilder textReceiver = new StringBuilder();
        StringBuilder textPrinter = new StringBuilder();

        boolean isZero = true;
        boolean isOne = false;

        // Докато не въведа ключовата фраза:
        while (!input.equals("Clone them!")) {

            isZero = true; // връщам в начална позиция за новия цикъл;
            isOne = false; // връщам в начална позиция за новия цикъл;

            //Броя всеки нов ред от конзолата:
            rowsCounter++;

//Заменям излишните удивителни знаци с интервал:
//input = input.replaceAll("!+", " ");

            // Преобразувам стринговия вход в целочислен масив, премахвайки разделителя:
            int[] sequence = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();


            // Изчислявам сумата на числата от конкретния низ:
            for (int digits : sequence) {
                currentSequenceSum += digits;
                // Генерирам текстов вариант на низа за печат:
                textReceiver.append(digits).append(" ");
            }

            // Проверявам дали низът не е изграден само от нули:
            for (int digit : sequence) {
                if (digit != 0) {
                    isZero = false;
                    break;
                }
                textPrinter = new StringBuilder(); // занулявам променливата;
                textPrinter.append(textReceiver);  // съхранявам този низ за печат;
            }

            //Ако дължината на прочитане на низа е равна на 1:
            if (length == 1 && sequence[0] == 1) {
                isOne = true;
                textPrinter = new StringBuilder(); // занулявам променливата;
                textPrinter.append(textReceiver);  // съхранявам този низ за печат;
            }

            // Ако дължината на прочитане на низа е по-голяма от 1, намирам последователност от единици:
            for (int i = 0; i < length - 1; i++) {
                if (!isZero && sequence[i] + sequence[i + 1] > 1) {
                    // Маркирам на коя позиция съм намерил последователност:
                    currentSequence = i + 1;

                    // Проверявам дали позицията на текущия низ е по-малка от най-малката запазена до сега:
                    if (currentSequence < greatestSequence) {
                        greatestSequence = currentSequence; // най-малката позиция, приема стойността на този низ;
                        greatestSum = currentSequenceSum;    // най-голямата сума, приема стойността на този низ;
                        textPrinter = new StringBuilder(); // занулявам променливата;
                        textPrinter.append(textReceiver);  // съхранявам този низ за печат;
                        printRow = rowsCounter; // съхранявам реда на който се е случило;
                    }

                    /* Проверявам дали текущият низ е равен на най-добрият запазен до сега, и ако е така,
                       дали сумата на числата му е по-голяма от най-голямата запазена сума: */
                    if (currentSequence == greatestSequence && currentSequenceSum > greatestSum) {
                        greatestSum = currentSequenceSum; // най-голямата сума приема стойността на този низ
                        greatestSequence = currentSequence; // най-малката позиция, приема стойността на този низ;
                        textPrinter = new StringBuilder(); // занулявам променливата;
                        textPrinter.append(textReceiver);  // съхранявам този низ за печат;
                        printRow = rowsCounter; // съхранявам реда на който се е случило;
                    }
                }
            }
            currentSequenceSum = 0; // занулявам сумата за новия цикъл;
            textReceiver = new StringBuilder(); // занулявам текста за новия цикъл;

            //Вход от конзолата - текст:
            input = scanner.nextLine();

        } //Печат:
        if (isZero) {
            System.out.println("Best DNA sample 1 with sum: 0.");
            System.out.print(textPrinter);
        } else if (isOne) {
            System.out.println("Best DNA sample 1 with sum: 1.");
            System.out.print(textPrinter);
        } else {
            System.out.printf("Best DNA sample %d with sum: %d.\n", printRow, greatestSum);
            System.out.print(textPrinter);
        }
    }
}