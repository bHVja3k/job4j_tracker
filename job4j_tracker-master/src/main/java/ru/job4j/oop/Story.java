package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();

        fox.eat(kolobok);
        hare.nothing(wolf);
        kolobok.run(wolf);
        kolobok.run2(hare);
    }
}