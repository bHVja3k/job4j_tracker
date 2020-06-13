package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println();
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println(" ID заявки: " + item.getId() + System.lineSeparator() + "Имя заявки: " + item.getName());
            } else if (select == 1) {
                System.out.println(System.lineSeparator() + "=== Show all item ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(" ID заявки: " + item.getId() + System.lineSeparator() + "Имя заявки: " + item.getName());
                }
            } else if (select == 2) {
                System.out.println(System.lineSeparator() + "=== Edit item ===\n");
                System.out.println("Введите ID завки для замены: ");
                String id = input.askStr("Enter id: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка успешно заменена");
                } else {
                    System.out.println("Id указан неверно");
                }
            } else if (select == 3) {
                System.out.println(System.lineSeparator() + "=== Delete item ===");
                String delete = input.askStr("Enter id: ");
                if (tracker.delete(delete)) {
                    System.out.println("Заявка успешно заменена");
                } else {
                    System.out.println("Id указан неверно");
                }
            } else if (select == 4) {
                System.out.println(System.lineSeparator() + "===  Find item by Id ===");
                String byid = input.askStr("Enter id: ");
                Item item = tracker.findById(byid);
                if (tracker.findById(byid) != null) {
                    System.out.println(" ID заявки: " + item.getId() + System.lineSeparator() + "Имя заявки: " + item.getName());
                } else {
                    System.out.println("Id указан неверно");
                }
            } else if (select == 5) {
                System.out.println(System.lineSeparator() + "=== Find items by name ===");
                String byname = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(byname);
                if (items.length > 0) {
                    for (Item value : items) {
                        System.out.println(" ID заявки: " + value.getId() + System.lineSeparator() + " Имя заявки: " + value.getName());
                    }
                } else {
                    System.out.println("Имя указано неверно");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(System.lineSeparator() + "Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println();
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}