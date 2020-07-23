package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = attachment -> attachment.getSize() > 100;
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = attachment -> attachment.getName().contains("bug");
        return filter(list, func);
    }


    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment item : list) {
            if (predicate.test(item)) {
                rsl.add(item);
            }
        }
        return rsl;
    }
}