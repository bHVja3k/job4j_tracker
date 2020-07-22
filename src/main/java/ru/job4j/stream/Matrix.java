package ru.job4j.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public List<Integer> convertToList(Integer[][] array) {
        return List.of(array).stream().flatMap(Arrays::stream).collect(Collectors.toList());
    }


}
