package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matchesTotal = 11;
        int answerCount = 0;
        int matchesPlayerOne = 0;
        int matchesPlayerTWo = 0;

        while (true) {
            if (matchesTotal <= 0) {
                if (matchesPlayerOne > matchesPlayerTWo) {
                    System.out.println("Победил игрок 1");
                } else {
                    System.out.println("Победил игрок 2");
                }
                break;
            }
            System.out.println("Введите число от 1 до 3: ");
            int answer = Integer.valueOf(input.nextLine());
            if (answer < 0 || answer > 3) {
                System.out.println("Вы ввели неверное число, придется начать сначала :(");
                break;
            }
            if (answerCount % 2 == 0) {
                matchesPlayerOne++;
                answerCount++;
                matchesTotal -= answer;
                System.out.println("После ответа первого игрока на столе осталось " + matchesTotal + " спичек");
            } else {
                matchesPlayerTWo++;
                answerCount++;
                matchesTotal -= answer;
                System.out.println("После ответа второго игрока на столе осталось " + matchesTotal + " спичек");
            }
        }
    }
}