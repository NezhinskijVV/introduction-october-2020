package ru.itsjava;

public class MethodsPractice {

    //psvm
    public static void main(String[] args) {
        System.out.println("getMin(5,3) = " + getMin(5, 3));
        System.out.println("getMin(3,5) = " + getMin(3, 5));
        System.out.println("getMin(3,3) = " + getMin(3, 3));

        printMaxValue(6, 3);
        printMinValue(7, 4);

    }

    public static int getMin(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }

    public static void printMaxValue(int num1, int num2) {
        System.out.println("Максимальное значение: " + Math.max(num1, num2));
    }

    //Напечатать минимальное значение из двух целых чисел
    public static void printMinValue(int num1, int num2) {
//        if (num1 < num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);

        System.out.println(getMin(num1, num2));
    }

}