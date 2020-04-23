package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petr Arsentev");
        student.setGroup("310");
        student.setCreated(new Date());

        System.out.println(student.getFio() + " is in a group - " + student.getGroup());
    }
}
