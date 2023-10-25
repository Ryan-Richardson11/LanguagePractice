import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

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
        System.out.println("Enter the file path to search: ");
        Scanner input = new Scanner(System.in);
        Path fileToSearch = Paths.get(input.nextLine());
        input.close();

        if (Files.exists(fileToSearch)) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }

    void displayDirectory() {
        System.out.println("Enter the directory to display : ");
        Scanner input = new Scanner(System.in);
        Path directoryToDisplay = Paths.get(input.nextLine());
        input.close();
        if (Files.isDirectory(directoryToDisplay)) {
            for (Path file : directoryToDisplay) {
                System.out.println(file);
            }
        }
    }

    void fileContents() {
        System.out.println("Enter the file you would like to see the contents of: ");
        Scanner input = new Scanner(System.in);
        String fileContents = input.nextLine();
        input.close();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileContents));
            while (fileContents.nextLine()) {
                String currentLine = reader.readLine();
                System.out.println(currentLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
