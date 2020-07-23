package ru.job4j.stream;

import java.util.Objects;

public class Student {

    private final int score;
    private final String surname;


    public int getScore() {
        return score;
    }
    public String getSurname() {
        return surname;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getScore() == student.getScore() &&
                Objects.equals(getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScore(), getSurname());
    }
}