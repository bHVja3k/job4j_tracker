package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> name = k -> k.getName().contains(key);
        Predicate<Person> surname = k -> k.getSurname().contains(key);
        Predicate<Person> phone = k -> k.getPhone().contains(key);
        Predicate<Person> address = k -> k.getAddress().contains(key);
        Predicate<Person> combine = k -> name.or(surname.or(phone.or(address))).test(persons.get(0));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}