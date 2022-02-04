package module4.Mod4Problem3;

public class CS extends Course {
    private int exams;
    private int projects;

    public CS(String courseName, int courseNum, String dept, String professor, int exams, int projects) {
        super(courseName, courseNum, dept, professor);
        this.exams = exams;
        this.projects = projects;
    }

    public void setExams(int exams) {
        this.exams = exams;
    }

    public int getExams() {
        return exams;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        System.out.println("Computer Science Course: ");
        String parentStr = super.toString();
        String examStr = "Exams: " + exams;
        String projectStr = "Projects: " + projects;
        
        return parentStr + "\n" + examStr + "\n" + projectStr;
    }
}
