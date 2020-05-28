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

    /**
     * Метод поиска заявки по имени
     *
     * @param name имя заявки, которую нужно найти
     * @return список заявок
     */

    public Item[] findByName(String name) {
        Item[] result = new Item[items.length];
        int indexResult = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].getName().equals(name)) {
                result[indexResult] = this.items[i];
                break;
            }
        }
        return result;
    }

    /**
     * Метод поиска всез заявок в хранилище
     *
     * @param id заявок, которые нужно вывести
     * @return список заявок
     */

    public Item[] findAll(String id) {
        Item[] result = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                result[index] = this.items[index];
            }
        }
        return result;
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
     *
     * @param id   заявки, которую нужно заменить
     * @param item новая заявка
     */

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
        }
        return rsl;
    }

    /**
     * Метод удаления заявки из хранилища
     *
     * @param id заявки, которую нужно удалить
     */

    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}