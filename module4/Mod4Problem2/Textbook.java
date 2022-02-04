package module4.Mod4Problem2;

public class Textbook extends ReadingMaterials{
    private String author;
    private String subject;

    public Textbook(String title, int pages, String author, String subject) {
        super(title, pages);
        this.author = author;
        this.subject = subject;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        System.out.println("Textbook: ");
        String parentStr = super.toString();
        String authorStr = "Author: " + author;
        String subjectStr = "Subject: " + subject;

        return parentStr + "\n" + authorStr + "\n" + subjectStr;
    }
}
