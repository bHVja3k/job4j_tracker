package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matchesTotal = 11;
        boolean playerOne = false;
        System.out.println("Игра спички");
        while (matchesTotal > 0) {
            if (playerOne) {
                System.out.println("Ход первого игрока");
            } else {

                System.out.println("Ход второго игрока");
            }
            System.out.println("Введите число от 1 до 3: ");
            int answer = Integer.valueOf(input.nextLine());
            if (answer < 0 || answer > 3) {
                System.out.println("Вы ввели неверное число, придется начать сначала");
                break;
            }
            matchesTotal -= answer;
            if (matchesTotal <= 0) {
                matchesTotal = 0;
            }
            System.out.println("После вашего ответа на столе осталось " + matchesTotal + " спичек");
            playerOne = !playerOne;
        }
        if (playerOne) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}