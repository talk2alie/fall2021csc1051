package data;

import java.io.*;
import java.util.*;

import activities.*;

public class Database {
    private final String TODO_ITEMS_TABLE = "C:\\Repos\\fall2021csc1051\\projects\\ConsoleTodo\\data\\todoitems.tbl";
    private final String TODO_LISTS_TABLE = "C:\\Repos\\fall2021csc1051\\projects\\ConsoleTodo\\data\\todolists.tbl";

    private Hashtable<Integer, TodoList> todolists;
    private Hashtable<Integer, TodoItem> todoItems;

    public Database() throws IOException {
        todolists = new Hashtable<>();
        todoItems = new Hashtable<>();

        load();
    }

    
    private void load() throws IOException {
        loadTodoItems();
        loadTodoLists();
        populateTodoListWithTodoItems();
    }

    
    private void populateTodoListWithTodoItems() {
        for (TodoList list : todolists.values()) {
            for (TodoItem item : todoItems.values()) {
                if(item.getTodoListId() == list.getId()) {
                    list.addItem(item);
                }
            }
        }
    }

    private void loadTodoLists() throws IOException {
        var file = new File(TODO_LISTS_TABLE);
        var reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.isEmpty() || line.trim().startsWith("Id")) {
                continue;
            }

            String[] tokens = line.split(",");
            int id = Integer.parseInt(tokens[0]);
            String title = tokens[1];
            String dueDate = tokens[2];
            TodoList todoList = new TodoList(id, title, dueDate);

            todolists.put(todoList.getId(), todoList);
        }

        reader.close();
    }

    private void loadTodoItems() throws IOException {
        var file = new File(TODO_ITEMS_TABLE);
        var reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.isEmpty() || line.trim().startsWith("Id")) {
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

    public Collection<TodoItem> getTodoItems() {
        return todoItems.values();
    }

    public Collection<TodoList> getTodoLists() {
        return todolists.values();
    }

    public void AddTodoList(TodoList list) {
        if(todolists.containsKey(list.getId())) {
            int newId = todolists.size() + 1;
            list = new TodoList(newId, list.getTitle(), list.getDueDate());            
        }

        todolists.put(list.getId(), list);
        AddTodoItems(list.getItems());
    }

    private void AddTodoItems(Collection<TodoItem> items) {
        for (TodoItem todoItem : items) {
            if(todoItems.containsKey(todoItem.getId())) {
                int newId = todoItems.size() + 1;
                todoItem = new TodoItem(newId, todoItem.getTodoListId(), todoItem.getTitle(), todoItem.getDueDate(), todoItem.getStatus());
            }

            todoItems.put(todoItem.getId(), todoItem);
        }
    }

    public void commit() throws IOException {
        saveLists();
        saveItems();        
    }


    private void saveLists() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(TODO_LISTS_TABLE);
        writer.println("Id,Title,DueDate");

        for (TodoList list : getTodoLists()) {
            String line = list.toTable();
            writer.println(line);
        }
        writer.close();
    }

    private void saveItems() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(TODO_ITEMS_TABLE);
        writer.println("Id,TodoListId,Title,DueDate,Status");

        for (TodoItem item : getTodoItems()) {
            String line = item.toTable();
            writer.println(line);
        }
        writer.close();
    }
}
