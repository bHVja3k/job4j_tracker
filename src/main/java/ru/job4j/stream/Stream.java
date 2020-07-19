package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> tasks = new ArrayList<>();
        tasks.add(1);
        tasks.add(-1);
        tasks.add(2);
        tasks.add(-2);
        tasks.add(3);
        tasks.add(-3);
        List<Integer> bugs = tasks.stream()
                .filter(task -> task >= 0)
                .collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}