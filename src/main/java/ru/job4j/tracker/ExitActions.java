package ru.job4j.tracker;

public class ExitActions implements UserAction {
    private final Output out;

    public ExitActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
