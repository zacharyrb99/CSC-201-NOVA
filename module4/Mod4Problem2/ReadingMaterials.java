package module4.Mod4Problem2;

public class ReadingMaterials {
    private String title;
    private int pages;

    public ReadingMaterials(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        String titleStr = "Title: " + title;
        String pageStr = "Page Count: " + pages;

        return titleStr + "\n" + pageStr;
    }
}
