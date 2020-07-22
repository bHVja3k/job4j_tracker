package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenGrade10A() {
        List<Student> students = List.of(
                new Student("a",100),
                new Student("a",90),
                new Student("a",80),
                new Student("a",70),
                new Student("a",60),
                new Student("a",50),
                new Student("a",40)
        );
        List<Student> result = School.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() >= 70 && student.getScore() <= 100
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }

    @Test
    public void whenGrade10B() {
        List<Student> students = List.of(
                new Student("a",100),
                new Student("a",90),
                new Student("a",80),
                new Student("a",70),
                new Student("a",60),
                new Student("a",50),
                new Student("a",40)
        );
        List<Student> result = School.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() >= 50 && student.getScore() < 70
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }

    @Test
    public void whenGrade10C() {
        List<Student> students = List.of(
                new Student("a",100),
                new Student("a",90),
                new Student("a",80),
                new Student("a",70),
                new Student("a",60),
                new Student("a",50),
                new Student("a",40)
        );
        List<Student> result = School.collect(students, student -> student.getScore() < 50);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() >= 0 && student.getScore() < 50
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }
}