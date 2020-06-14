package ru.job4j.tracker;

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
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (tracker.findById(id) != null) {
            System.out.println(" ID item: " + item.getId() + System.lineSeparator() + "Name item: " + item.getName());
        } else {
            System.out.println("Id invalid");
        }
        return true;
    }
}
