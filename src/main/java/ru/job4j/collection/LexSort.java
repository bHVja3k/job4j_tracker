package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        if (left.length() > right.length()) {
            return 1;
        } else if (left.length() < right.length()) {
            return -1;
        }
        return left.compareTo(right);
    }
}