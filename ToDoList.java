package DSA_Individual;

public class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = this.head;
        while (current != null) {
            if (current.task.getTitle().equalsIgnoreCase(title)) {
                current.task.markCompleted();
                System.out.println("Task '" + title + "' has been marked as completed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task '" + title + "' not found in the to-do list.");
    }

    public void viewToDoList() {
        Node current = this.head;
        System.out.println("To-Do List:");
        while (current != null) {
            System.out.println("Title: " + current.task.getTitle());
            System.out.println("Completed: " + (current.task.isCompleted() ? "Yes" : "No"));
            System.out.println("Description: " + current.task.getDescription());
            
            System.out.println();
            current = current.next;
        }
        if (this.head == null) {
            System.out.println("The to-do list is empty.");
        }
    }
}