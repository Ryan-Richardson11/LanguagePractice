import java.io.File;
import java.util.Scanner;

public class file {

    void createFile() {
        System.out.println("Enter a file to create: ");
        Scanner input = new Scanner(System.in);
        String newFile = input.nextLine();
        input.close();
        File myFile = new File(newFile);
        if (myFile.createNewFile()) {
            System.out.println("File " + newFile + " was created");
        }
        else {
            System.out.println("File could not be created");
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

    }

    void searchFile() {

    }

    void displayDirectory() {

    }

    void fileContents() {

    }

}



