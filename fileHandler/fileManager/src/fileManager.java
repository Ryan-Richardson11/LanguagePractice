
import java.util.Scanner;
public class fileManager {
    public static void main(String[] args) {
        while (true) {
            System.out.println("What task would you like to complete?");
            System.out.println("1: Create a file");
            System.out.println("2: Delete a file");
            System.out.println("3: Move a file");
            System.out.println("4: Search a file");
            System.out.println("5: Display a directory");
            System.out.println("6: Display file contents");
            System.out.println("Enter anything else to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            file myFile = new file();
            if (choice == 1) {
                myFile.createFile();
            }
            else if (choice == 2) {
                myFile.deleteFile();
            }
            else if (choice == 3) {
                myFile.moveFile();
            }
            else if (choice == 4) {
                myFile.searchFile();
            }
            else if (choice == 5) {
                myFile.displayDirectory();
            }
            else if (choice == 6) {
                myFile.fileContents();
            }
            else {
                break;
            }
        }
    }
}
