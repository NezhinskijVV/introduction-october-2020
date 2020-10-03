package ru.itsjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {

    //psvm
    public static void main(String[] args) {
        System.out.println("Я люблю Java!");
        System.out.println(); //sout

        int num = 10;
        System.out.println("num = " + num); //soutv
/*
Привет я Виталик!
Как дела?
Я не Виталик, а многострочный комментарий
 */

        int sum = num + 5;
        System.out.println("Сумма числа num и 5 равна: " + sum);

        sum += 5; // ctrl + d -- копирование строки
        // ctrl + shift + (стрелка вверх/вниз) -- перенести строчку

        System.out.println("sum = " + sum);

        System.out.println("(sum + 5) = " + (sum + 5));

        double realNum = 5.0;
        System.out.println("realNum = " + realNum);

        double infinity = 5.0 / 0.0;
        System.out.println("infinity = " + infinity);

        double notANumber = 0.0 / 0.0;
        System.out.println("notANumber = " + notANumber);

        System.out.println(5.0 / 0);

        System.out.println(5 / 3);
        System.out.println(5 % 3);

        //ctrl + alt + l или cmd + opt + l

        boolean isWeatherGood = true;
        System.out.println("isWeatherGood = "
                + isWeatherGood);

        System.out.println("5>3 = " + (5 > 3));
        System.out.println("(5!=3) = " + (5 != 3));

        boolean isWeatherBad = false;

        System.out.println("Я проснулся");
        if (!isWeatherGood) {
            System.out.println("Я беру зонт");
        }
        System.out.println("Я иду гулять");


//        String name = null;
//
//        if ((name != null) & (!name.isEmpty())) {
//            System.out.println(name);
//        }

        isWeatherBad = false;
        System.out.println("Я проснулся");
        if (isWeatherBad) {
            System.out.println("Я беру зонт");
        } else {
            System.out.println("Я одеваю шлепанцы");
        }
        System.out.println("Я иду гулять");

        System.out.println("Вложенный оператор if-else");
        isWeatherBad = false;
        boolean isWarm = false;
        System.out.println("Я проснулся");
        if (isWeatherBad) {
            System.out.println("Я беру зонт");
        } else if (isWarm) {
            System.out.println("Я одеваю шлепанцы");
        } else {
            System.out.println("Я одеваю кросовки");
        }
        System.out.println("Я иду гулять");


        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость товара");
        double priceItem = console.nextDouble();
        System.out.println("Введите количество товара");
        int countItems = console.nextInt();
        double totalPrice = priceItem * countItems;
        System.out.println("Итоговая сумма " + totalPrice);

        // меньше 18 служить рано
        // от 18 - 27  Иди служить
        // > 27 служить уже поздно




    }
}