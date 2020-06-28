package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i).toString());
        }
        return true;
    }
}
