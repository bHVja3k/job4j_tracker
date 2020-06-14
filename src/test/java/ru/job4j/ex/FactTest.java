package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void when5toFail() {
        Fact.calc( -5);
    }
}