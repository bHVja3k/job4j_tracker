package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListStud {
    public Map<Integer, String> listToMap(List<Student> list) {
        return list.stream().collect(Collectors.toMap(Student::getScore, Student::getSurname));
    }
}

