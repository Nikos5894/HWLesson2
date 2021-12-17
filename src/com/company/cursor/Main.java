package com.company.cursor;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1. Заповнити масив тільки парними числами
        int[] oddNumbers = new int[100];
        for (int i = 0, a = 2; i < oddNumbers.length; i++) {
            oddNumbers[i] = a;
            a += 2;
        }
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));

        //2. Заповнити масив рандомними числами
        int[] randomNumbers = new int[100];
        Random random = new Random();
        for (int i = 0, a; i < randomNumbers.length; i++) {
            a = random.nextInt(100);
            randomNumbers[i] = a;
        }
        System.out.println("Random values: " + Arrays.toString(randomNumbers));

        //3. Вивести середнє значення масиву
        int avg = 0;
        for (int i = 0, a; i < randomNumbers.length; i++) {
            a = randomNumbers[i];
            avg += a;
        }
        System.out.println("AVG: " + avg / randomNumbers.length);

        //4. Вивести суму всіх значень кратних 3
        int sum = 0;
        for (int i = 0, a; i < randomNumbers.length; i++) {
            a = randomNumbers[i];
            if (a % 3 == 0) {
                sum += a;
            }
        }
        System.out.println("sum of all multiples of 3: " + sum);

        //5. Вивести значення всіх парних індексів масиву
        int[] arrIndex = new int[randomNumbers.length / 2];
        for (int i = 0, a = 0; i < randomNumbers.length; i++) {
            if (i % 2 == 0) {
                arrIndex[a] = randomNumbers[i];
                a++;
            }
        }
        System.out.println("Values of odd indexes: " + Arrays.toString(arrIndex));


        //6. Просортувати масив в порядку зростання
        //bubble sort
        int[] arrToSort = randomNumbers.clone();
        for (int i = 0; i < arrToSort.length - 1; i++) {
            int temp;
            for (int j = 1; j < arrToSort.length - i; j++) {
                if (arrToSort[j - 1] > arrToSort[j]) {
                    temp = arrToSort[j - 1];
                    arrToSort[j - 1] = arrToSort[j];
                    arrToSort[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arrToSort));

        //7. Вивести найменше значення в масиві
        int min = randomNumbers[0];
        for (int i = 0; i < randomNumbers.length - 1; i++) {

            for (int j = 1; j < randomNumbers.length - i; j++) {
                if (randomNumbers[j] < min) {
                    min = randomNumbers[j];
                }
            }
        }
        System.out.println("Min values: " + min);


        //8. Вивести найбільше значення масиву
        int max = randomNumbers[0];
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            for (int j = 1; j < randomNumbers.length - i; j++) {
                if (randomNumbers[j] > max) {
                    max = randomNumbers[j];
                }
            }
        }
        System.out.println("Max value: " + max);


        //9. Вивести значення парних індексів масиву
        int[] arrIndex1 = new int[20];
        for (int i = 0, a = 0; i < 20; i++) {
            if (i % 2 == 0) {
                arrIndex1[a] = oddNumbers[i];
                a++;
            }
        }
        System.out.println("First 20 values of odd indexes: " + Arrays.toString(arrIndex1));

        //10. Вивести перших 20 символів з таблиці ASCI
        char[] firstTwentySymbols = new char[20];
        for (int i = 0; i < firstTwentySymbols.length; i++) {
            firstTwentySymbols[i] = (char) (i);
        }
        System.out.println("First 20 symbols from ASCI table: " + Arrays.toString(firstTwentySymbols));

        //додаткою виведу 20 символів з таблиці ASCI починаючи з 80 позиції
        char[] TwentySymbols = new char[20];
        for (int i = 0; i < TwentySymbols.length; i++) {
            TwentySymbols[i] = (char) (i + 80);
        }
        System.out.println("20 symbols from ASCI table: " + Arrays.toString(TwentySymbols));
    }
}
