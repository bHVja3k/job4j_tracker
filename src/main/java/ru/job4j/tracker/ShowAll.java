package ru.job4j.tracker;

public class ShowAll implements UserAction {

    private final Output out;

    public ShowAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            if (item[index] != null) {
                System.out.println(" ID item: " + item[index].getId() + System.lineSeparator() + "Name item: " + item[index].getName());
            }
        }
        return true;
    }
}
