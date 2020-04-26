package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Метод для добавления заявок в Tracker
     *
     * @param item заявка
     * @return возвращает добавленную заявку
     */

    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    private String generateId() {
        return String.valueOf(ids++);
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findByName(String name) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findAll(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            rsl = items[index];
        }
        return rsl;
    }
}