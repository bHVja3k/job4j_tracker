package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    /**
     * Метод для добавления заявок в Tracker
     *
     * @param item заявка
     * @return возвращает добавленную заявку
     */

    public List<Item> add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return items;
    }

    private String generateId() {
        return String.valueOf(ids++);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public List<Item> findById(String id) {
        ArrayList<Item> ids = new ArrayList<Item>();
        for (Item cell : items) {
            if (id.equals(cell.getId())) {
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
            if (name.equals(cell.getName())) {
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
        boolean result = false;
        int index = indexOf(id);
        if (index != -1){
            item.setId(id);
            items.set(index, item);
            result = true;
        }
        return result;
    }


    /**
     * Метод удаления заявки из хранилища
     *
     * @param id заявки, которую нужно удалить
     */

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(items.get(index));
            result = true;
        }
        return result;
    }
}