package module3.Mod3Problem3;

public class Book {
    String title, author;
    int numberOfPages;

    // Default constructor
    public Book() {
        this.title = "N/A";
        this.author = "N/A";
        this.numberOfPages = 0;
    }

    // Constructor with title, author, numPages parameters
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // toString() method to print out Book details
    @Override
    public String toString() {
        return "Book: [title = " + title + ", author = " + author + ", numberOfPages = " + numberOfPages + "]";
    }
}
