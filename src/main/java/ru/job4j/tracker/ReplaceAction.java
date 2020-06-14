package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("==== Item replace ====" + System.lineSeparator() + "  ID item: " + item.getId() + System.lineSeparator() + "Name item: " + item.getName());
        } else {
            System.out.println("Id invalid");
        }
        return true;
    }
}
