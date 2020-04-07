package ru.job4j.oop;

public class Cat {

    private String name;
    private String food;

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("Name cat: " + this.name);
        System.out.println("Food cat: " + this.food);

    }
}