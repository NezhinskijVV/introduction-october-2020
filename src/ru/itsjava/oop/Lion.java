package ru.itsjava.oop;

public class Lion {
    private String name;

    public Lion() {
        System.out.println("Лев создан");
    }

    public Lion(String name) {
        System.out.println("Лев создан");
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public void sayMeow() {
        System.out.println("Meow");
    }
}
