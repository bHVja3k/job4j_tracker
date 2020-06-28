package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    ArrayList<Item> items = new ArrayList<Item>();
    private int ids = 1;
    private int size = 0;

    /**
     * Метод для добавления заявок в Tracker
     *
     * @param item заявка
     * @return возвращает добавленную заявку
     */

    public List<Item> add(Item item) {
        items.add(item);
        return items;
    }

    private String generateId() {
        return String.valueOf(ids++);
    }


    public List<Item> findById(String id) {
        ArrayList<Item> ids = new ArrayList<Item>();
        for (Item cell : items) {
            if (id == cell.getId()) {
                ids.add(cell);
            }
        }
        return ids;
    }

    /**
     * Метод поиска заявки по имени
     *
     * @param name имя заявки, которую нужно найти
     * @return список заявок
     */

    public List<Item> findByName(String name) {
        ArrayList<Item> ids = new ArrayList<Item>();
        for (Item cell : items) {
            if (name == cell.getName()) {
                ids.add(cell);
            }
        }
        return ids;
    }

    /**
     * Метод поиска всез заявок в хранилище
     *
     * @return список заявок
     */

    public List<Item> findAll() {
        return items;
    }


    /**
     * Метод замены заявки в хранилище (id заявки сохраняется)
     *
     * @param id   заявки, которую нужно заменить
     * @param item новая заявка
     */
    public boolean replace(String id, Item item) {
        items.set(items.indexOf(id), item);
        return true;
    }

    /**
     * Метод удаления заявки из хранилища
     *
     * @param id заявки, которую нужно удалить
     */

    public boolean delete(String id) {
        items.remove(items.indexOf(id));
        return true;
    }
}