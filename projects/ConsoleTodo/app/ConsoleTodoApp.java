package app;

import java.io.IOException;

import activities.TodoItem;
import activities.TodoList;
import data.Database;

public class ConsoleTodoApp {
    public static void main(String[] args) throws IOException {
        System.out.println();

        TodoItem stockings = new TodoItem(1, 1, "Get Stockings", "2021-11-15");
        TodoItem tree = new TodoItem(2, 1, "Get Christmas Tree", "2021-11-15");
        TodoItem lights = new TodoItem(3, 1, "Get Christmas Lights", "2021-11-20");

        TodoList christmas = new TodoList(1, "Christmas Shopping", "2021-12-15");
        christmas.addItem(stockings);
        christmas.addItem(tree);
        christmas.addItem(lights);

        TodoItem tickets = new TodoItem(1, 2, "Get Tickets", "2022-06-15");
        TodoItem luggage = new TodoItem(2, 2, "Get Mid-sized Luggage", "2022-06-15");
        TodoItem babysitter = new TodoItem(3, 2, "Find a babysitter", "2022-01-20");

        TodoList vacation = new TodoList(2, "Vacation Shopping", "2022-06-15");
        vacation.addItem(tickets);
        vacation.addItem(luggage);
        vacation.addItem(babysitter);

        Database database = new Database();
        database.AddTodoList(christmas);
        database.AddTodoList(vacation);
        database.commit();

        System.out.println();
    }
}
