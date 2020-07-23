package ru.job4j.tracker;

import java.util.List;

public class FindById implements UserAction {
    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findById(input.askStr("Enter id: "));
        for (Item value : item) {
            System.out.println(" ID item: " + value.getId() + System.lineSeparator() + "Name item: " + value.getName());
        }
        return true;
    }
}
