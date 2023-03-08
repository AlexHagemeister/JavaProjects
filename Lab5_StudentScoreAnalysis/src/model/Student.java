/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package model;

import java.util.Arrays;

/**
 * The Student class is used to store the student ID and the scores for 5 quizzes.
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class Student {

    private int SID;
    private int[] scores;
    
    // Default constructor
    public Student() {
        SID = 0;
        scores = null;
    }
    
    // Overloaded initialization constructor
    public Student(int SID, int[] scores) {
        this.SID = SID;
        this.scores = scores;
    }
    public int getNumScores() {
        if (scores != null) {
            return scores.length;
        } else {
            return 0;
        }
    }
    /**
     * Get score at index
     * @param index
     * @return score at index
     */
    public int getScore(int index) {
        return scores[index];
    }

    // Getters and setters
    public int getSID() {
        return SID;
    }
    public void setSID(int sID) {
        SID = sID;
    }
    public int[] getScores() {
        return scores;
    }
    public void setScores(int[] scores) {
        this.scores = scores;
    }
    // print all instance variables
    public void print() {
        System.out.println("SID: " + SID);
        System.out.println("Scores: " + Arrays.toString(scores));
    }
}
