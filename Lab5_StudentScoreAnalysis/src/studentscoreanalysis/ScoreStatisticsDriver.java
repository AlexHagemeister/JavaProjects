/* 
Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023 
*/

package studentscoreanalysis;


/**
 * The Statistics class is used to store the lowest, highest, and average scores for 5 quizzes.
 * @author Alex Hagemeister
 * @version 1.0
 * @since March 7, 2023
 */
public class ScoreStatisticsDriver {

	public static void main(String[] args) {

		Student lab2 [] = new Student[40];

		//Populate the student array

		lab2 = Util.readFile("TestScores.txt", lab2);

		Statistics statlab2 = new Statistics();

		statlab2.findlow(lab2);

		//add calls to findhigh and find average

		//Print the data and statistics

	}

}
