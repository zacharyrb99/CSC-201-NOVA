package module4.Mod4Problem2;

public class Book extends ReadingMaterials{
    private String author;
    private String genre;
    private String mainCharacter;

    public Book(String title, int pages, String author, String genre, String mainCharacter) {
        super(title, pages);
        this.author = author;
        this.genre = genre;
        this.mainCharacter = mainCharacter;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setMainChar(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public String getMainChar() {
        return mainCharacter;
    }

    @Override
    public String toString() {
        System.out.println("Book: ");
        String parentStr = super.toString();
        String authorStr = "Author: " + author;
        String genreStr = "Genre: " + genre;
        String mainChar = "Main Character: " + mainCharacter;

        return parentStr + "\n" + authorStr + "\n" + genreStr + "\n" + mainChar;
    }
}
