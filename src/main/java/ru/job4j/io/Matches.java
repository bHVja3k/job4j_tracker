package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int match = 11;
        System.out.println("Игра 11");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Введите число от 1 до 3: ");
            int answer = Integer.valueOf(input.nextLine());
            if (answer < 0 || answer > 3) {
                System.out.println(answer + " это не число от 1 до 3!\nНачните снова: ");
                break;
            }
        }
    }
}