package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String delete = input.askStr("Enter id: ");
        if (tracker.delete(delete)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Id invalid");
        }
        return true;
    }
}
