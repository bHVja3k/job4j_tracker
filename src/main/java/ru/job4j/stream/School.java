package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> rsl = new ArrayList<>();
        for (Student value : students) {
            if (predict.test(value)) {
                rsl.add(value);
            }
        }
        return rsl;
    }

    Predicate<Student> predict = new Predicate<Student>() {
        @Override
        public boolean test(Student student) {
            return false;
        }
    };
}