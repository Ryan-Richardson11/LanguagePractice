import java.util.Scanner;
import java.util.ArrayList;

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return description + (isCompleted ? " (Completed)" : "");
    }
}

class TodoList {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        System.out.println("TODO List:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a task:");
            System.out.println("Enter 2 to remove a task:");
            System.out.println("Enter 3 to complete a task:");
            System.out.println("Enter 4 to display the list:");
            System.out.println("Enter any other number to exit:");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Enter a task description: ");
                String description = input.nextLine();
                Task newTask = new Task(description);
                todoList.addTask(newTask);
            } else if (choice == 2) {
                System.out.println("Enter the description of the task to remove:");
                String description = input.nextLine();
                Task taskToRemove = null;
                for (Task task : todoList.tasks) {
                    if (task.getDescription().equals(description)) {
                        taskToRemove = task;
                        break;
                    }
                }
                if (taskToRemove != null) {
                    todoList.deleteTask(taskToRemove);
                    System.out.println("Task removed.");
                } else {
                    System.out.println("Task not found.");
                }
            } else if (choice == 3) {
                System.out.println("Enter the description of the task to complete:");
                String description = input.nextLine();
                for (Task task : todoList.tasks) {
                    if (task.getDescription().equals(description)) {
                        task.markAsCompleted();
                        System.out.println("Task marked as completed.");
                        break;
                    }
                }
            } else if (choice == 4) {
                todoList.displayTasks();
            } else {
                break;
            }
        }

        input.close();
    }
}
