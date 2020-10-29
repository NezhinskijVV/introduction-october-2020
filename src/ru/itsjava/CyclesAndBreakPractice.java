package ru.itsjava;

import java.util.Arrays;

public class CyclesAndBreakPractice {

    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5, 2, 0, 6};
        System.out.println("Arrays.toString(numbers) = "
                + Arrays.toString(numbers));

        //Вывести элементы массива, которые больше трех
        System.out.println("Вывести элементы массива, которые больше трех");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 3) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        //Вывести индекс первого элемента, который больше 3
        System.out.println("Вывести индекс первого элемента," +
                " который больше 3");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 3) {
                System.out.println("Индекс первого элемента, " +
                        "который больше 3 равен: " + i);
                break;
            }
        }

        //Сумма элементов массива:

        System.out.println("Сумма элементов массива");
        int sumElements = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sumElements += numbers[i];
        }
        System.out.println("Сумма элементов равна " + sumElements);


    }
}