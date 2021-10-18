import java.time.LocalDate;

/**
 * Todoitem
 */
public class TodoItem {

    private String title;
    private LocalDate dueDate;
    private String status; // New, Started, Completed

    // yyyy-mm-dd 2021-10-18
    public TodoItem(String title, String dueDate) {
        this.title = title;
        this.dueDate = LocalDate.parse(dueDate.trim());
        status = "New";
    }

    public void changeStatus(String status) {
        if(status.equalsIgnoreCase("New") || status.equalsIgnoreCase("Started") || status.equalsIgnoreCase("Completed")){
            this.status = status;
        }
    }

    public void changeTitle(String title) {
        this.title = title;
    }
}