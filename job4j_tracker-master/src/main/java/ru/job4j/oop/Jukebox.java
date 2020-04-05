package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music(i);
        }
    }

}
