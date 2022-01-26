package module2.Mod2Problem2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float degOfDiff = inputValidDegreeOfDifficulty();
        float[] arrOfScores = inputAllScores();
        float max = -1;
        float min = 11;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arrOfScores.length; i++) {
            if (arrOfScores[i] > max) {
                if (arrOfScores[i] <= 10) {
                    max = arrOfScores[i];
                    maxIndex = i;    
                }
            } else if (arrOfScores[i] < min) {
                if (arrOfScores[i] >= 0) {
                    min = arrOfScores[i];    
                    minIndex = i;
                }
            }
        }

        arrOfScores[maxIndex] = 0;
        arrOfScores[minIndex] = 0;

        float score = calculateScore(arrOfScores, degOfDiff);
        System.out.println(Arrays.toString(arrOfScores));
        System.out.println(String.format("Diver's score is: %s", score));
    }

    public static float inputValidScore(int judgeNum) {
        Scanner scan = new Scanner(System.in);

        System.out.println(String.format("Judge #%s score: ", judgeNum + 1));
        float score = scan.nextFloat();

        if (score < 0 || score > 10) {
            System.out.println("Score must be between 0 and 10.");
            inputValidScore(judgeNum);
        }

        return score;
    }

    public static float[] inputAllScores() {
        float[] scores = new float[7];

        for (int i = 0; i < 7; i++) {
            scores[i] = inputValidScore(i);
        }

        return scores;
    }

    public static float inputValidDegreeOfDifficulty() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Degree of difficulty: ");
        float degOfDiff = scan.nextFloat();

        while (degOfDiff < 1.2 || degOfDiff > 3.8) {
            System.out.println("Degree of difficulty must be between 1.2 and 3.8.");
            degOfDiff = scan.nextFloat();
        }
        
        return degOfDiff;
    }

    public static float calculateScore(float[] arrOfScores, float degOfDiff) {
        float score;
        float sum = 0;

        for (int i = 0; i < arrOfScores.length; i++) {
            sum += arrOfScores[i];
        }

        score = sum * degOfDiff;
        score *= 0.6;

        return score;
    }
}   