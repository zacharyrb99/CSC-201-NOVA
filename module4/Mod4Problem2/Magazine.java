package module4.Mod4Problem2;

public class Magazine extends ReadingMaterials{
    private String genre;
    private String issue;

    public Magazine(String title, int pages, String genre, String issue) {
        super(title, pages);
        this.genre = genre;
        this.issue = issue;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        System.out.println("Magazine: ");
        String parentStr = super.toString();
        String genreStr = "Subject: " + genre;
        String issueStr = "Issue: " + issue;

        return parentStr + "\n" + genreStr + "\n" + issueStr;
    }
}
