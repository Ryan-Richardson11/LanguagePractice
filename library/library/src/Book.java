import java.util.Scanner;
import java.util.ArrayList;

public class Book{

    private String title;
    private String author;
    private char availability;

    public Book(String title, String author, char availability){
        this.title = title;
        this.author = author;
        this.availability = availability;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.author;
    }

    char checkAvailability(){
        return this.availability;
    }

    void makeAvailable(){
        if (this.availability == 'U'){
            this.availability = 'A';
        }
    }

    void makeUnavailable(){
        if (this.availability == 'U'){
            this.availability = 'A';
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        // Create student instances and add them to the list
        library.add(new Book("To Kill a Mockingbird", "Harper Lee", 'A'));
        library.add(new Book("1984", "George Orwell", 'U'));
        library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 'A'));

        System.out.println("Books in the Library: ");
        for ( Book book : library){
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.checkAvailability());
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a title to check availability: ");
        String ans = input.nextLine();
        for (Book book : library){
            if ans.equals(book.getTitle()){
                System.out.println(book.checkAvailability());
            }

        }
    }
}
