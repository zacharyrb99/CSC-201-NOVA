package module4.Mod4Problem3;

public class Course {
    private String courseName;
    private int courseNum;
    private String dept;
    private String professor;

    public Course(String courseName, int courseNum, String dept, String professor) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.dept = dept;
        this.professor = professor;
    }

    public void setName(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return this.getName();
    }

    public void setNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public int getNum() {
        return courseNum;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setProf(String professor) {
        this.professor = professor;
    }

    public String getProf() {
        return professor;
    }

    @Override
    public String toString() {
        String courseNameStr = "Course Name: " + courseName; 
        String courseStr = "Course: " + dept + " " + courseNum;
        String profStr = "Professor: " + professor;

        return courseNameStr + "\n" + courseStr + "\n" + profStr;
    }
}
