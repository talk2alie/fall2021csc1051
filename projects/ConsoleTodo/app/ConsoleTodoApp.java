package app;

import activities.TodoItem;
import activities.TodoItemStatus;
import activities.TodoList;

public class ConsoleTodoApp {
    public static void main(String[] args) {
        System.out.println();

        var item = new TodoItem("Optimize Images", "2021-11-03");
        var item1 = new TodoItem("Study Kotlin", "2021-11-03");
        var item2 = new TodoItem("Research Cars for Lisa", "2021-11-03");

        var list = new TodoList("My Day", "2021-11-03");
        list.addItem(item);
        list.addItem(item1);
        list.addItem(item2);
        System.out.println(list);

        item2.changeStatus(TodoItemStatus.Started);
        System.out.println(list);

        item1.changeStatus(TodoItemStatus.Completed);
        System.out.println(list);

        list.deleteItem(item2.getTitle());;
        System.out.println(list);

        var item3 = new TodoItem("study Kotlin", "2021-11-03");
        list.addItem(item3);
        System.out.println(list);

        System.out.println();
    }
}
