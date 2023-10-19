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
        String fileToDeletePath = input.nextLine();
        input.close();
        File fileToDelete = new File(fileToDeletePath);
        if (fileToDelete.delete()) {
            System.out.println("The file has been deleted.");
        }
        else {
            System.out.println("The file could not be deleted.");
        }
    }

    void moveFile() {
        System.out.println("Enter the full path of the file you would like to move: ");
        Scanner input = new Scanner(System.in);
        String fileToMovePath = input.nextLine();
        File fileToMove = new File(fileToMovePath);
        System.out.println("Enter a path to move the file: ");
        String newPath = input.nextLine();
        copy(fileToMove, newPath);
    }

    void searchFile() {

    }

    void displayDirectory() {

    }

    void fileContents() {

    }

}



