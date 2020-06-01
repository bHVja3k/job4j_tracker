package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Matches matches = new Matches();
        int match = 11;
        System.out.println("Игра 11");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Первый игрок берет от 1 до 3 спичек: ");
            int one = Integer.valueOf(input.nextLine());
            if(matches.range(one)){
                System.out.println(one + " это не чсило от 1 до 3!\nЕще раз:");
                one = Math.abs(input.nextInt());
            }



            System.out.print("Второй игрок берет от 1 до 3 спичек: ");
            int two = Integer.valueOf(input.nextLine());
            while (two < 1 || two > 3) {
                System.out.println(two + " это не чсило от 1 до 3!\nЕще раз:");
                two = Math.abs(input.nextInt());
            }
            int balance = match - (one + two);
            match = balance;
            System.out.println("Осталось спичек: " + balance);
            System.out.println();
            if (match <= 0) {
                run = false;
            }
        }
    }

    public boolean range(int num) {
        boolean range = false;
        if (num < 1 || num > 3) {
            range = true;
        } else {
            System.out.println(num + " это не число от 1 до 3!\nЕще раз:");
        }
        return range;
    }
}