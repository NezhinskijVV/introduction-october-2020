package ru.itsjava;

import java.util.Scanner;

public class ShoesShop {

    public static void main(String[] args) {
        String[] items = new String[]{"Nike", "H&M", "Adidas"};
        Scanner console = new Scanner(System.in);
        printMenu();
        while (true) {
            System.out.println("Введи номер меню: ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printAllShoes(items);
            } else if (menuNum == 2) {
                items = addShoesBrand(items, console);
            } else if (menuNum == 3) {
                items = removeShoesBrand(items, console);
            } else if (menuNum == 4) {
                bubbleSort(items);
            } else if (menuNum == 0) {
                System.out.println("Пока!");
                System.exit(0);
            }
        }
    }

    private static void bubbleSort(String[] items) {
        for (int j = 0; j < items.length; j++) {
            for (int i = 0; i < items.length - j - 1; i++) {
                if (items[i].charAt(0) > items[i + 1].charAt(0)) {
                    String temp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = temp;
                }
            }
        }
    }

    private static String[] removeShoesBrand(String[] brands, Scanner console) {
        System.out.println("Введите марку обуви, которую хотите померить:");
        String inputBrand = console.next();
        String[] resBrands = new String[brands.length - 1];

        int delIndex = -1;
        for (int i = 0; i < brands.length; i++) {
            if (inputBrand.equals(brands[i])) {
                delIndex = i;
                break;
            }
            resBrands[i] = brands[i];
        }

        if (delIndex == -1) return brands;

        for (int i = delIndex; i < resBrands.length; i++) {
            resBrands[i] = brands[i + 1];
        }
        return resBrands;
    }

    private static String[] addShoesBrand(String[] brands, Scanner console) {
        System.out.println("Введите новую марку обуви:");
        String inputBrand = console.next();
        String[] resBrands = new String[brands.length + 1];
        for (int i = 0; i < brands.length; i++) {
            resBrands[i] = brands[i];
        }
        resBrands[brands.length] = inputBrand;
        return resBrands;
    }

    private static void printAllShoes(String[] shoes) {
        for (String shoe : shoes) {
            System.out.print(shoe + " ");
        }
        System.out.println();
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Посмотреть всю обувь\n" +
                "2. Добавить бренд\n" +
                "3. Померить и убежать\n" +
                "4. Отсортировать по алфавиту\n" +
                "5.\n" +
                "6.\n" +
                "0. Выход");
    }

}
//ДЗ: 1. Лексикографический порядок

// 5, 6 пункты в магазине
// 3 удалить

// Проект:
//Меню:
//1. Посмотреть всю обувь
//2. Добавить обувь
//3. Померить и убежать
//4. Отсортировать по алфавиту
//5.
//6.
//0. Выход