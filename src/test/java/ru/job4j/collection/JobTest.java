package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByHighPriority() {
        Comparator<Job> cmpHighPriority = new JobHighDescByPriority();
        int rsl = cmpHighPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByHighName() {
        Comparator<Job> cmpHighName = new JobHighDescByName();
        int rsl = cmpHighName.compare(
                new Job("Iml tak", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByHigtNameAndHighProrityDesc() {
        Comparator<Job> cmpNamePriority = new JobHighDescByName().thenComparing(new JobHighDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }


    @Test
    public void whenCompatorByNameAndProrityIsEqualTo() {
        Comparator<Job> cmpNamePriority = new JobHighDescByName().thenComparing(new JobHighDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("B", 2)
        );
        assertThat(rsl, equalTo(0));
    }
}