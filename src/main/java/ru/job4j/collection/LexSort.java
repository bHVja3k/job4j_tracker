package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] split1 = left.split(". ");
        String[] split2 = right.split(". ");
        int leftResult = Integer.parseInt(split1[0]);
        int rightResult = Integer.parseInt(split2[0]);
        return Integer.compare(leftResult, rightResult);
    }
}