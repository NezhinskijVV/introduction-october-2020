package ru.itsjava;

public class CyclesPractice {

    //psvm
    public static void main(String[] args) {
//        int count = 3;
//        while (count < 6){
//            System.out.println("Я люблю Java!");
//            count ++;
//        }
//        while (true){
//            System.out.println("Infinity cycle");
//        }

        int[] numbersArray = new int[10];
        System.out.println("numbersArray.length = " + numbersArray.length);
        System.out.println("numbersArray[9] = " + numbersArray[9]);

//        System.out.println(numbersArray[10]);  <-- ArrayIndexOutOfBound
//        System.out.println(numbersArray[-1]);

        numbersArray[0] = 5;
        System.out.println(numbersArray[0]);

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Я люблю Java");  //sout
//        }

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }

        System.out.println();
        var array = new int[]{1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        //последние 2 элемента
        for (int i = array.length - 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nПервые 2 элемента массива");
        //первые 2 элемента массива
        for (int i = 0; i < 2; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nОт второго элемента до предпоследнего");
        //первые 2 элемента массива
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }

//        System.out.println("\n Вывести элементы массива на четных идексах");
//        for (int i = 1; i < array.length; i += 2) {
//            System.out.print(array[i] + " ");
//        }

        System.out.println("\nВывести массив в обратном порядке");
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i] + " ");
        }
    }
}