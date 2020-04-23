package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("War", 100);
        Book two = new Book("Peace", 445);
        Book three = new Book("Idiot", 196);
        Book four = new Book("Clean code", 194);

        Book[] array = new Book[4];

        array[0] = one;
        array[1] = two;
        array[2] = three;
        array[3] = four;

        for (Book pr : array) {
            System.out.println(pr.getName() + " - " + pr.getNumber());
        }

        System.out.println("---------------------------");
        System.out.println("Replace index 0 to index 3.");
        System.out.println("---------------------------");
        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (Book pr : array) {
            System.out.println(pr.getName() + " - " + pr.getNumber());
        }


        System.out.println("---------------------------");
        System.out.println("Output of books with the name Clean code.");
        System.out.println("---------------------------");
        for (int index = 0; index < array.length; index++) {
            Book pr = array[index];
            if (pr.getName().equals("Clean code")) {
                System.out.println(pr.getName() + " - " + pr.getNumber());
            }
        }
    }
}