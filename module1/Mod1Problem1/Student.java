package module1.Mod1Problem1;
import java.util.Scanner; // allows for user input

public class Student {
    // Class variables
    int studentId;
    int chapter;
    int problem;
    int page;

    Student() {

    }

    // Function for calculating chapter
    void calculateChapter (int id) {
        chapter = (id % 3) + 3;
    }

    // Function for calculating problem number
    void calculateProblem (int id) {
        switch (chapter) {
            // Chapter 3
            case 3:
                problem = (studentId % 34) + 1;
            
            // Chapter 4
            case 4: 
                chapter = 6;
                problem = (studentId % 38) + 1;

            // Chapter 6
            case 5:
                problem = (studentId % 46) + 1;
        }
    }

    // Function to take user input: ID and page number
    // will output instructions for user
    void showProblem () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your studentId number: ");
        studentId = scan.nextInt();

        calculateChapter(studentId);
        calculateProblem(studentId);

        System.out.println(String.format("What page is problem %s in chapter %s on?", problem, chapter));
        page = scan.nextInt();

        scan.close();

        System.out.println(String.format("Please solve programming exercise %s from chapter %s on page %s.", problem, chapter, page));
    }
}
