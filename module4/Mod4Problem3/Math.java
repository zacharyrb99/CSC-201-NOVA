package module4.Mod4Problem3;

public class Math extends Course {
    private int exams;

    public Math(String courseName, int courseNum, String dept, String professor, int exams) {
        super(courseName, courseNum, dept, professor);
        this.exams = exams;
    }

    public void setExams(int exams) {
        this.exams = exams;
    }

    public int getExams() {
        return exams;
    }

    @Override
    public String toString() {
        System.out.println("Math Course: ");
        String parentStr = super.toString();
        String examStr = "Exams: " + exams;
        
        return parentStr + "\n" + examStr;
    }
}
