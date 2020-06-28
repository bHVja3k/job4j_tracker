/*

package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        List<Item> item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", item.get(0).getId(), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.get(0).getId()), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        List<Item> item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", item.get(0).getId(), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.get(0).getId()), is(nullValue()));
    }

    @Test
    public void findByNameFound() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        List<Item> item = tracker.add(new Item("sometext"));
        String foundName = "sometext";
        Input in = new StubInput(
                new String[]{"0", foundName, "1"}
        );
        UserAction[] actions = {
                new FindByName(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findByName(item.get(0).getName()), is(foundName));
    }


    @Test
    public void FindByIdAction() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        List<Item> item = tracker.add(new Item("New Item"));
        Input in = new StubInput(
                new String[]{"0", item.get(0).getId(), "1"}
        );
        UserAction[] actions = {
                new FindById(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.get(0).getId()), is("New Item"));
    }

    @Test
    public void FindAllAction() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        List<Item> item = tracker.add(new Item("New item"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowAll(out),
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll(), is("New item"));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitActions(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
}
*/
