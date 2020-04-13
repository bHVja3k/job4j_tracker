package ru.job4j.animal;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);

    }

    public Predator() {
        System.out.println("load Predator");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }

}
