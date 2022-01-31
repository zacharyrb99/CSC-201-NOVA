package module3.Mod3Problem3;

public class Volume {
    String volumeName;
    int numberOfBooks;
    Book[] books;
    
    // Default constructor
    public Volume() {
        this.volumeName = "N/A";
        this.numberOfBooks = 0;
    }

    // Constructor with volumeName, numBooks, bookArray parameters
    public Volume(String volumeName, int numberOfBooks, Book[] books) {
        this.volumeName = volumeName;
        this.numberOfBooks = numberOfBooks;
        this.books = books;
    }

    // toString() method to print out Volume details
    @Override
    public String toString() {
        return "Volume: [name = " + volumeName + ", number of books = " + numberOfBooks + ", books = " + getBookArray() + "]";
    }

    // method to print data for each book in book array
    public String getBookArray() {
        String returnStr = "";

        for (int i = 0; i < books.length; i++) {
            returnStr += books[i].toString() + " "; 
        }

        return returnStr;
    }
}
