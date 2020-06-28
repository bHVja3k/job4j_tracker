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
        for (int i = 0; i < item.size(); i++) {
            System.out.println(" ID item: " + item.get(i).getId() + System.lineSeparator() + "Name item: " + item.get(i).getName());
        }
        return true;
    }
}
