package ru.itsjava;

import java.util.Scanner;

public class IfPractice {

    public static void main(String[] args) {
        // меньше 18 служить рано
        // от 18 - 27  Иди служить
        // > 27 служить уже поздно

//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите целочисленный возраст: ");
//        int age = console.nextInt();
//
//        if ((age < 0) || (age > 150)) {
//            System.out.println("Некорректный возраст");
//        } else if (age > 27) {
//            System.out.println("Послужишь в другой жизни!");
//        } else if (age < 18) {
//            System.out.println("Служить слишком рано! " +
//                    "Но ничего скоро мы за тобой прийдем!");
//        } else {
//            System.out.println("Добро пожаловать к нам!" +
//                    " Приводи друзей!");
//        }

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("После смены значений");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
