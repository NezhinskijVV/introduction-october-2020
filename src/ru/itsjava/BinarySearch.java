package ru.itsjava;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        var array = new int[]{-10, -7, 0, 5, 15};
        System.out.println("Массив: " + Arrays.toString(array));
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int numFromConsole = console.nextInt();
        System.out.println("Индекс числа в массиве равен: "
                + binarySearch(numFromConsole, 0,
                array.length - 1, array));
    }

    public static int binarySearch(int num, int start,
                                   int end, int[] array) {
        int midIndex = start + (end - start) / 2;
        //базовый случай
        if (num == array[midIndex]) {
            return midIndex;
        }
        if (num > array[midIndex]) {
            return binarySearch(num, midIndex + 1, end, array);
        }
        return binarySearch(num, start, midIndex - 1, array);
    }
}