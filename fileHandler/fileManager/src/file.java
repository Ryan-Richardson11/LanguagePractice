import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.IOException;

public class file {

    void createFile() {
        System.out.println("Enter a file path to create: ");
        Scanner input = new Scanner(System.in);
        String newFile = input.nextLine();
        input.close();
        Path path = Paths.get(newFile);
        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void deleteFile() {
        System.out.println("Enter your files full path: ");
        Scanner input = new Scanner(System.in);
        String fileToDelete = input.nextLine();
        input.close();
        Path path = Paths.get(fileToDelete);
        try {
            if (Files.exists(path)) {
                Files.delete(path);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void moveFile() {
        System.out.println("Enter the full path of the file you would like to move: ");
        Scanner input = new Scanner(System.in);
        Path fileToMovePath = Paths.get(input.nextLine());
        System.out.println("Enter a path to move the file: ");
        Path newPath = Paths.get(input.nextLine());
        input.close();
        try {
            if (Files.exists(fileToMovePath)) {
                Files.copy(fileToMovePath, newPath);
                Files.delete(fileToMovePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void searchFile() {

    }

    void displayDirectory() {

    }

    void fileContents() {

    }

}



