package app;

import java.io.IOException;
import java.util.Scanner;

import activities.TodoItem;
import activities.TodoList;
import data.Database;

public class ConsoleTodoApp {
    public static void main(String[] args) throws IOException {
        System.out.println();

        final String EXIT = "exit";

        Scanner scanner = new Scanner(System.in);
        String command = EXIT;

        do {
            System.out.println("Welcome to Console To Do");
            System.out.println("To continute, please use the following commands:");
            System.out.println("1. vl: To view all To Do Lists and their items");
            System.out.println("2. vl <Todo List Title>: For e.g. \"vl My Day\" to view a To Do list, with the title \"My Day\"");
            System.out.println("3. al: To add a new To Do List");
            System.out.println("3. ai <Todo List Title>: For e.g. \"ai My Day\" to add a new To Do Item to a To Do list, with title \"My Day\"");
            System.out.println("3. ri <Todo List Title>: For e.g. \"ri My Day\" to remove a To Do Item from a To Do list, with title \"My Day\"");
            System.out.println("3. ai <Todo List Title>: For e.g. \"ai My Day\" to add a new To Do Item to a To Do list, with title \"My Day\"");

        } while(!command.equalsIgnoreCase(EXIT));
        scanner.close();

        System.out.println();
    }
}
