package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void whenMatrix() {
        Integer[][] array = {{2, 7, 9}, {3, 6, 1}};
        Matrix matrix = new Matrix();
        List<Integer> result = matrix.convertToList(array);
        List<Integer> expected = List.of(
                2, 7, 9, 3, 6, 1
        );
        assertThat(result, is(expected));
    }
}