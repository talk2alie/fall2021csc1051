package activities;

import java.time.LocalDate;
import java.util.Hashtable;

public class TodoList {
    private int id;
    private String title;
    private LocalDate dueDate;
    private Hashtable<String, TodoItem> todoItems;
    
    public TodoList(int id, String title, String dueDate) {
        this.id = id;
        this.title = title;
        this.dueDate = LocalDate.parse(dueDate.trim());
        todoItems = new Hashtable<>();
    }

    public int getId() {
        return id;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void changeDueDate(String dueDate) {
        this.dueDate = LocalDate.parse(dueDate.trim());
    }

    public String getDueDate() {
        return dueDate.toString();
    }

    public void addItem(TodoItem item) {
        if(todoItems.containsKey(item.getTitle())) {
            return;
        }

        todoItems.put(item.getTitle(), item);
    }

    public void deleteItem(String title) {
        todoItems.remove(title);
    }

    public boolean isComplete() {
        for (TodoItem item : todoItems.values()) {
            if(!item.isComplete()) {
                return item.isComplete();
            }
        }

        return true;
    }

    public String toTable() {
        return String.format("%d,%s,%s", id, title, dueDate);
    }

    public String toString() {
        String result = String.format("%s (%s)\n", title, dueDate);
        for (TodoItem item : todoItems.values()) {
            result += String.format(">%s\n", item);
        }

        return result;
    }
}
