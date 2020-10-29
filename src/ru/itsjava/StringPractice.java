package ru.itsjava;

public class StringPractice {

    public static void main(String[] args) {
        String str = "Я супер строка!";
        System.out.println(str);

        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(1) = " + str.charAt(1));
        str = str + "^_^";
        System.out.println(str);

        System.out.println("str.equals(\"Я супер строка!^_^\") = "
                + str.equals("Я супер строка!^_^"));

        System.out.println("str.equalsIgnoreCase(\"Я сУпеР строка!^_^\") = "
                + str.equalsIgnoreCase("Я сУпеР строка!^_^"));


        System.out.println("str.compareTo(\"Даша\") = " + str.compareTo("Даша"));
    }
}
