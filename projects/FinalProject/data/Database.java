package data;

import java.io.*;
import java.util.*;

import activities.*;

public class Database {
    // Use absolute paths to the files on your computer here
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
        // Write code that will add todo items from the todoitems
        // hashtable to the appropriate todolist's todoItems hashtable
    }

    private void loadTodoLists() {
        // Write code that read the todo list file and put all 
        // todo lists in the todolists hashtable above
    }

    private void loadTodoItems() throws IOException {
        // Write code that read the todo items file and put all
        // todo items in the todoitems hashtable above
    }

    public Collection<TodoItem> getTodoItems() {
        return todoItems.values();
    }

    public Collection<TodoList> getTodoLists() {
        return todolists.values();
    }

    public void AddTodoList(TodoList list) {
        // Write code that add the given list to the todolists hashtable
        // above, as long as it already does not exist in the list
        // Use the todo list's id as key
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
