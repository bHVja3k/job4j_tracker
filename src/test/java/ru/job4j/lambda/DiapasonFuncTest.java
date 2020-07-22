package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiapasonFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = List.of(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x * x + 3 * x + 4);
        List<Double> expected = List.of(69D, 94D, 123D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        DiapasonFunc function = new DiapasonFunc();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = List.of(32D, 64D, 128D);
        assertThat(result, is(expected));
    }

}