package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void whenEveryUserHasAddress() {
        Profiles profile = new Profiles();
        List<Profile> pr = new ArrayList<>(
                Arrays.asList(
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile()
                ));
        List<Address> address = new ArrayList<>(
                Arrays.asList(
                        new Address("Moskov", "Atbat", 1, 5),
                        new Address("Moskov", "Atbat", 2, 4),
                        new Address("Moskov", "Atbat", 3, 3),
                        new Address("Moskov", "Atbat", 4, 2),
                        new Address("Moskov", "Atbat", 5, 1)
                ));

        for (int i = 0; i < address.size(); i++) {
            pr.get(i).setAddress(address.get(i));
        }

        List<Address> result = profile.collect(pr);
        List<Address> expected =
                Arrays.asList(
                        new Address("Moskov", "Atbat", 1, 5),
                        new Address("Moskov", "Atbat", 2, 4),
                        new Address("Moskov", "Atbat", 3, 3),
                        new Address("Moskov", "Atbat", 4, 2),
                        new Address("Moskov", "Atbat", 5, 1)
                );
        assertThat(result, is(expected));
    }
}