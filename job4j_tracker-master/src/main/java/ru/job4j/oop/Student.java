package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.accordion();
            petya.song();
        }
    }

    public void accordion() {
        System.out.println("Bum, bum, bum");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }
}