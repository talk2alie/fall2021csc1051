package data;



import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import activities.TodoItem;
import activities.TodoList;

public class Database {
    private final String TODO_ITEMS_TABLE = "data\\todoitems.tbl";
    private final String TODO_LISTS_TABLE = "data\todolists.tbl";

    private Hashtable<Integer, TodoList> todolists;
    private Hashtable<Integer, TodoItem> todoItems;

    public Database() {
        todolists = new Hashtable<>();
        todoItems = new Hashtable<>();
    }

    private void loadTodoItems() throws IOException {
        var file = new File(TODO_ITEMS_TABLE);
        var reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.trim().startsWith("Id")) {
                continue;
            }

            String[] tokens = line.split(",");
            int id = Integer.parseInt(tokens[0]);
            int todoListId = Integer.parseInt(tokens[1]);
            String title = tokens[2];
            String dueDate = tokens[3];
            TodoItem todoItem = new TodoItem(id, todoListId, title, dueDate);

            todoItems.put(todoItem.getId(), todoItem);
        }

        reader.close();
    }

    private void loadTodoLists() throws IOException {
        var file = new File(TODO_LISTS_TABLE);
        var reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.trim().startsWith("Id")) {
                continue;
            }

            String[] tokens = line.split(",");
            int id = Integer.parseInt(tokens[0]);
            String title = tokens[2];
            String dueDate = tokens[3];
            TodoList todoList = new TodoList(id, title, dueDate);

            todolists.put(todoList.getId(), todoList);
        }

        reader.close();
    }
}
