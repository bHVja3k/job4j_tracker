package ru.job4j.tracker;

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
        String byName = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(byName);
        if (items.length > 0) {
            for (Item value : items) {
                System.out.println(" ID item: " + value.getId() + System.lineSeparator() + " Name item: " + value.getName());
            }
        } else {
            System.out.println("Invalid name");
        }
        return true;
    }
}
