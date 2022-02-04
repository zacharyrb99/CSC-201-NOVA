package module4.Mod4Problem3;

public class Art extends Course {
    private int paintings;

    public Art(String courseName, int courseNum, String dept, String professor, int paintings) {
        super(courseName, courseNum, dept, professor);
        this.paintings = paintings;
    }

    public void setExams(int paintings) {
        this.paintings = paintings;
    }

    public int getExams() {
        return paintings;
    }

    @Override
    public String toString() {
        System.out.println("Art Course: ");
        String parentStr = super.toString();
        String paintingStr = "Paintings: " + paintings;
        
        return parentStr + "\n" + paintingStr;
    }
}
