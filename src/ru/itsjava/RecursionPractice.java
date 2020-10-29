package ru.itsjava;

public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println("Факториал 5 равен " + fact(5));
    }

    //5! = 5 * 4 * 3 * 2 * 1
    //0! = 1! = 1
    private static int fact(int num) {
        if (num == 1 || num == 0) {  //базовый
            return 1;
        }
        return num * fact(num - 1); //
    }

}