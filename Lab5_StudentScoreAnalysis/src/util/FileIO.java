/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import model.Student;

/**
 * The Statistics class is used to store the lowest, highest, and average scores for 5 quizzes.
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class FileIO {

    private String fileName;   // file name

    // Default constructor
    public FileIO() {
        fileName = null;
    }

 /**
 * Reads the file contents and builds the array with populated student objects.
 * @param fileName name of the last file read
 * @param studentArray array of student objects
 */
public void readFile(String fileName, Student[] studentArray) {

        // Set the file name
        this.fileName = fileName;

        // Use try-with-resources to get auto-closeable behavior.
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;            // line read from file
            String header = null;   // header line
            int arrayPos = 0;       // position in array

            // Read file line by line
            while((line = reader.readLine()) != null && arrayPos < studentArray.length) {

                // Tokenize the line
                StringTokenizer tokenizer = new StringTokenizer(line, " ");

                // If header line, save it and move to next line
                if ("Stud Qu1 Qu2 Qu3 Qu4 Qu5".equals(line)) {
                    header = line;
                    continue;

                // If blank line, move to next line
                } else if ("".equals(line)) {
                    System.out.printf("%n%n%nBlank line found in file: %s %n", fileName);
                    continue;

                // Else, create a student object and add it to the array
                } else {
                    // Get the student ID
                    int SID = Integer.parseInt(tokenizer.nextToken());

                    // Create an array to hold scores of size number of tokens - 1 (SID)
                    int[] scores = new int[tokenizer.countTokens() - 1];

                    // Get the scores
                    for (int i = 0; i < scores.length; i++) {
                        scores[i] = Integer.parseInt(tokenizer.nextToken());
                    }
                    // Create a student object and add it to the array
                    studentArray[arrayPos] = new Student(SID, scores);
                    arrayPos++;
                }
            }
        } catch (IOException e) {
            // System.out.printf("Error reading file: %s", e.toString());
            System.out.printf("Error reading file: %s %n", fileName);
        } 
    }

    // Setters and getters
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Print all instance variables
    public void print() {
        System.out.printf("Current file: %s", fileName);
    }
}
