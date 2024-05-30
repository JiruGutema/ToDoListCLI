package DSA_Individual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask(toDoList, scanner);
                    break;
                case 2:
                    markTaskAsCompleted(toDoList, scanner);
                    break;
                case 3:
                    viewToDoList(toDoList);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Ichoice not found");
            }

            System.out.println();
        } while (choice != 4);
    }

    private static void displayMenu() {
        System.out.println("To-Do List Application");
        System.out.println("1. Add a task");
        System.out.println("2. Mark a task as completed");
        System.out.println("3. View the to-do list");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask(ToDoList toDoList, Scanner scanner) {
        System.out.print("Enter the task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(title, description);
        toDoList.addToDo(newTask);
        System.out.println("Task added to the to-do list.");
    }

    private static void markTaskAsCompleted(ToDoList toDoList, Scanner scanner) {
        System.out.print("Enter the title of the task to mark as completed: ");
        String title = scanner.nextLine();
        toDoList.markToDoAsCompleted(title);
    }

    private static void viewToDoList(ToDoList toDoList) {
        toDoList.viewToDoList();
    }
}
    

