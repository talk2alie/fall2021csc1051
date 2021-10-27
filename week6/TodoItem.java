import java.time.LocalDate;

import bootcamp.people.Title;

/**
 * Todoitem
 */
public class TodoItem {

    private String title;
    private LocalDate dueDate;
    private ItemStatus status; // New, Started, Completed

    // yyyy-mm-dd 2021-10-18
    public TodoItem(String title, String dueDate) {
        this.title = title;
        this.dueDate = LocalDate.parse(dueDate.trim());
        status = ItemStatus.New;
    }

    public void changeStatus(ItemStatus status) {
        this.status = status;
    }

    public void changeTitle(String title) {
        this.title = title;
    }
}