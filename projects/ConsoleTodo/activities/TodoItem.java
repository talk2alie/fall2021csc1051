package activities;

import java.time.LocalDate;
import java.util.Hashtable;

public class TodoItem {
    private int id;
    private int todoListId;
    private String title;
    private LocalDate dueDate;
    private TodoItemStatus status;

    /**
     * Creates an instance of a Todo item with the given information
     * @param title - the title of the item
     * @param dueDate - the date on which the item is expected to be completed
     * @param status - the current status of the item. Default is New
     */
    public TodoItem(int id, int todoListId, String title, String dueDate, TodoItemStatus status) {
        this.id = id;
        this.todoListId = todoListId;
        this.title = title;
        this.dueDate = LocalDate.parse(dueDate.trim());
        this.status = status;
    }

    /**
     * Creates an instance of a Todo item with the given information and a New status
     * @param title - the title of the item
     * @param dueDate - the date on which the item is expected to be completed
     */
    public TodoItem(int id, int todoListId, String title, String dueDate) {
        this(id, todoListId, title, dueDate, TodoItemStatus.New);
    }

    public int getId() {
        return id;
    }

    public int getTodoListId() {
        return todoListId;
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
 
    public void changeStatus(TodoItemStatus status) {
        this.status = status;
    }

    public TodoItemStatus getStatus() {
        return status;
    }

    public boolean isComplete() {
        return status == TodoItemStatus.Completed;
    }

    public String toTable() {
        return String.format("%d,%d,%s,%s,%s", id, todoListId, title, dueDate, status);
    }

    public String toString() {
        return String.format("%s: %s (%s)", getStatusEmoji(), title, dueDate);
    }

    private String getStatusEmoji() {
        Hashtable<TodoItemStatus, String> emojis = new Hashtable<>() {{
            put(TodoItemStatus.New, "🟨");
            put(TodoItemStatus.Started, "🟩");
            put(TodoItemStatus.Completed, "✅");
        }};

        return emojis.get(status);
    }
}
