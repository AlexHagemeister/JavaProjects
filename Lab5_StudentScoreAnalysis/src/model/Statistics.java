/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package model;

import java.util.Arrays;

/**
 * The Statistics class is used to store the lowest, highest, and average scores for 5 quizzes.
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class Statistics {

    private int[] lowScores;
    private int[] highScores;
    private float[] avgScores;

    // Default constructor
    public Statistics() {
        lowScores = null;
        highScores = null;
        avgScores = null;
    }
    // Overloaded initialization constructor
    public Statistics(Student[] studentArray) {
        // get number of quizzes
        int numQuizzes = studentArray[0].getNumScores();

        // initialize arrays
        lowScores = new int[numQuizzes];
        highScores = new int[numQuizzes];
        avgScores = new float[numQuizzes];

        // find low, high, and average scores
        findLow(studentArray);
        findHigh(studentArray);
        findAvg(studentArray);
    }
    /**
     * Finds the lowest scores for each quiz and stores them in the lowScores array.
     * @param studentArray array of student objects
     */
    public void findLow(Student[] studentArray) {

        // Initialize lowScores to a high value
        Arrays.fill(lowScores, 200);

        // Loop through each student
        for(int student = 0; student < studentArray.length; student++) {

            // Loop through each quiz
            for(int quizNumber = 0; quizNumber < studentArray[student].getNumScores(); quizNumber++) {

                // Get the current score
                int score = studentArray[student].getScore(quizNumber);

                // If the current score is lower than the current low score, update the low score
                if(score < lowScores[quizNumber]) {
                    lowScores[quizNumber] = score;
                }
            }
        }
    }
    /**
     * Finds the highest scores for each quiz and stores them in the highScores array.
     * @param studentArray array of student objects
     */
    public void findHigh(Student[] studentArray) {

        // Initialize highScores to a low value
        Arrays.fill(highScores, 0);

        // Loop through each student
        for(int student = 0; student < studentArray.length; student++) {

            // Loop through each quiz
            for(int quizNumber = 0; quizNumber < studentArray[student].getNumScores(); quizNumber++) {

                // Get the current score
                int score = studentArray[student].getScore(quizNumber);

                // If the current score is higher than the current high score, update the high score
                if(score > highScores[quizNumber]) {
                    highScores[quizNumber] = score;
                }
            }
        }

    }
    /**
     * Finds the average scores for each quiz and stores them in the avgScores array.
     * @param studentArray array of student objects
     */
    public void findAvg(Student[] studentArray) {

        // Initialize avgScores to 0
        Arrays.fill(avgScores, 0);

        // Loop through each student
        for(int student = 0; student < studentArray.length; student++) {

            // Loop through each quiz
            for(int quizNumber = 0; quizNumber < studentArray[student].getNumScores(); quizNumber++) {

                // Get the current score
                int score = studentArray[student].getScore(quizNumber);

                // Add the current score to the average score
                avgScores[quizNumber] += score;
            }
        }

        // Divide the sum of the scores by the number of students to get the average
        for(int quizNumber = 0; quizNumber < avgScores.length; quizNumber++) {
            avgScores[quizNumber] /= studentArray.length;
        }
    }

    // Getters and Setters
    public int[] getLowScores() {
        return lowScores;
    }
    public void setLowScores(int[] lowScores) {
        this.lowScores = lowScores;
    }
    public int[] getHighScores() {
        return highScores;
    }
    public void setHighScores(int[] highScores) {
        this.highScores = highScores;
    }
    public float[] getAvgScores() {
        return avgScores;
    }
    public void setAvgScores(float[] avgScores) {
        this.avgScores = avgScores;
    }

    /**
     * Prints the low, high, average, or all scores for each quiz, based on the user's selection.
     * @param userSelection user's selection: 1 (low)), 2 (high)), 3 (avg) - 4 (all).
     */
    public void printSelected(int userSelection) {
            
        switch(userSelection) {
            case 1:
                printLowScores();
                break;
            case 2:
                printHighScores();
                break;
            case 3:
                printAvgScores();
                break;
            case 4:
                printAllStats();
                break;
            default:
                System.out.printf("Invalid selection.%n");
        }
    }
    // Print methods
    public void printHighScores() {
        System.out.printf("High scores: ");
        for (int score : highScores) {
            System.out.printf("%d ", score);
        }
        System.out.printf("%n");
    }
    public void printLowScores() {
        // Print low scores
        System.out.printf("Low scores: ");
        for (int score : lowScores) {
            System.out.printf("%d ", score);
        }
        System.out.printf("%n");
    }
    public void printAvgScores() {
        System.out.printf("Average scores: ");
        for (float score : avgScores) {
            System.out.printf("%.2f ", score);
        }
        System.out.printf("%n");
    }
    // Print all instance variables
    public void printAllStats() {
        printHighScores();
        printLowScores();
        printAvgScores();
    }
}
