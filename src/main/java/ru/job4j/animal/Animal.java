package ru.job4j.animal;

public class Animal {
    public Animal(String name) {
    }

    public Animal() {
        super();
        System.out.println("load Animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}