package ru.itsjava.oop;

public class Jungle {

    public static void main(String[] args) {
        //ссылка имя  выделяем память с помощью new + конструктор
        Lion leo = new Lion();

        leo.sayMeow();
//int[] array = new int[4];

        Lion simba = new Lion("Simba");
        simba.printName();
        simba.sayMeow();

        leo.printName();
    }
}
