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
import java.util.Arrays;
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
    int numStudents;

    // Default constructor
    public FileIO() {
        fileName = null;
        numStudents = 0;
    }

 /**
 * Reads the file contents and builds the array with populated student objects.
 * @param fileName name of the file to read
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
            while((line = reader.readLine()) != null) {

                // Tokenize the line
                StringTokenizer tokenizer = new StringTokenizer(line, " ");

                // If header line, save it
                if (header == null) {
                    header = line;
                
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
            // Save the number of students
            numStudents = arrayPos;
        } catch (IOException e) {
            System.out.printf("Error reading file: %s", e.toString());
        } 
    }

    // Setters and getters
    public int getNumStudents() {
        return numStudents;
    }
    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Print all instance variables
    public void print() {
        System.out.printf("File name: %s", fileName);
        System.out.printf("numStudents: %d", numStudents);
    }
}
