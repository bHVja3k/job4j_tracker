package ru.job4j.tracker;

public class FindByName implements UserAction {
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
