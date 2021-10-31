package activities;

import java.time.LocalDate;
import java.util.Hashtable;

public class TodoList {
    private String title;
    private LocalDate dueDate;
    private Hashtable<String, TodoItem> todoItems;
    
    public TodoList(String title, String dueDate) {
        this.title = title;
        this.dueDate = LocalDate.parse(dueDate.trim());
        todoItems = new Hashtable<>();
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

    public String toString() {
        String result = String.format("%s (%s)\n", title, dueDate);
        for (TodoItem item : todoItems.values()) {
            result += String.format(">%s\n", item);
        }

        return result;
    }
}