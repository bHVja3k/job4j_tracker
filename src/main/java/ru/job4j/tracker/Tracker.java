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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод замены заявки в хранилище (id заявки сохраняется)
     * @param id заявки, которую нужно заменить
     * @param item новая заявка
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        this.items[index] = item;
        return true;
    }
}