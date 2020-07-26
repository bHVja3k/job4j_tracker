package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(
                predict
        ).collect(Collectors.toList());
    }

    public Map<String, Student> listToMap(List<Student> students) {
        return students.stream().collect(
                Collectors.toMap(Student::getSurname,
                        student -> student,
                        (oldValue, newValue) -> oldValue
                )
        );
    }
}