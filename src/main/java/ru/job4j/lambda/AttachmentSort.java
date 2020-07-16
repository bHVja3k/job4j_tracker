package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("1. Task", 1),
                new Attachment("2. Task", 2),
                new Attachment("11. Task", 11)
        );
        Comparator<Attachment> sizeDesc = (left, right) -> {
            System.out.println("compare sizes: " + right.getSize() + " - " + left.getSize());
            return right.getSize() - left.getSize();
        };
        attachments.sort(sizeDesc);
        System.out.println(attachments);
        Comparator<Attachment> nameDesc = (left, right) -> {
            System.out.println("compare names: " + right.getName() + " - " + left.getName());
            return right.getName().compareTo(left.getName());
        };
        attachments.sort(nameDesc);
        System.out.println(attachments);
    }
}