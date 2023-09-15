import java.util.Scanner;
import java.util.ArrayList;

class todoList {
    ArrayList<String> list = new ArrayList<String>();
    boolean completed = false;

    void addToList(String newTask){
        list.add(newTask);
    }

    void deleteFromList(String deletedTask){
        list.remove(deletedTask);
    }

    void displayList(){
        System.out.println(list);
    }

    void completeTask(String completedTask){
        completed = true;
        System.out.println("The task " + completedTask + " has been completed.");
        deleteFromList(completedTask);
    }

    static void printList(){
        System.out.println("TODO List: ");
        System.out.println("Enter 1 add a task: ");
        System.out.println("Enter 2 remove a task: ");
        System.out.println("Enter 3 to complete a task: ");
        System.out.println("Enter 4 to display the list: ");
        System.out.println("Enter any other number to exit: ");
    }

    public static void main(String[] args) {
        todoList myList = new todoList();
        Scanner input = new Scanner(System.in);
        while (true) {
            printList();
            int ans = input.nextInt();
            if (ans == 1){
                System.out.println("Enter a task to add: ");
                String task = input.next();
                myList.addToList(task);
            } 
            else if (ans == 2) {
                System.out.println("Enter a task to remove: ");
                String task = input.next();
                myList.deleteFromList(task);
            }
            else if (ans == 3) {
                System.out.println("Enter a task to complete: ");
                String task = input.next();
                myList.completeTask(task);
            }
            else if (ans == 3) {
                myList.displayList();
            }
            else {
                break;
            }

        }
    }
}
