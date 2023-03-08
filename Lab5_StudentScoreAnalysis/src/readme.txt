Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023
Submitted: ______


Program Description:

    Performs statistical analysis of scores for a class of students (up to 40 students) from a .txt file,
    displaying all scores, along with the high, low, and average scores. 

Data: 

    There are five quizzes during the term, and each student is identified by a four-digit student ID number.
    The first line may or may not contain the column identifiers: Stud Qu1 Qu2 Qu3 Qu4 Qu5
    The subsequent lines contain the student ID number and the five quiz scores for that student, separated by spaces.

    TEST CASES: 

        1. 15 records with header
        2. 1 record with header
        3. empty file with header
        4. 40 records with header 
        5. 42 records with header - ignore the last two rows.

 
Program specs:

    Student class: Blueprint for a student object.

        Variables:
            - SID (private int) student ID #
            - scores[] (private int[]) array of quiz scores
            
        Methods:
            - Student(): public default constructor
            - Student(int, int[]): public overloaded constructor
            - setSID(int): sets SID
            - getNumScores(): returns number of scores
            - Setters/Getters for instance variables
            - print(): prints instance variables

    Statistics class: Used to store the lowest, highest, and average scores for all quizzes

        Variables:
            - lowScores[] (private int[]): array of lowest scores
            - highScores[] (private int[]): array of highest scores
            - avgScores[] (private float[]): array of average scores

        Methods:
            - Statistics(): public default constructor
            - Statistics(Student[]): public overloaded constructor
            - findLow(Student[]) (public): finds lowest scores
            - findHigh(Student[]) (public): finds highest scores
            - findAvg(Student[]) (public): finds average scores
            - Setters/Getters for instance variables
            - printSelected(int): prints based on user selection
            - printHighScores(): prints highScores[]
            - printLowScores(): prints lowScores[]
            - printAvgScores(): prints avgScores[]
            - printAllStats(): prints all instance variables- highScores[], lowScores[], avgScores[]

    Util class: Used to read file and populate array of Student objects

        Variables:
            - fileName (private String): file name

        Methods:
            - Util() (public): default constructor
            - Util(String) (public): overloaded constructor
            - Setters/Getters for instance variables
            - readFile() (public): reads file and creates Student objects
            - print() (public): prints all instance variables

	ScoreStatisticsDriver class: Main class for program with user interface

        Variables:
            - fileParser: Util object
            - lab2: Student array
            - lab2Resized: Student array with no null values
            - statLab2: Statistics object

        Methods:
            - main(String[]): public static void main method
            - printMenu(): prints menu
            - getUserSelection(int validMin, int validMax): gets user selection


Program design:

	Input:
        - Util class reads data from file
        - ScoreStatisticsDriver class reads and validates user selection until user enters 5 to exit program

	Processing:
        - Util class creates Student objects and populates array
        - ScoreStatisticsDriver class creates Statistics object and calls methods to find lowest, highest, and average scores
	
	Printing: All printing uses System.out.printf()
        - ScoreStatisticsDriver class prints menu
        - Statistics class has methods to prints selected statistics
        - Each class has a print() method to print instance variables


	
PROGRAM TEST OUTPUT:

    Current file: 15_records_with_header.txt

Select from the follwing options: 
1. Print high scores for each quiz 
2. Print low scores for each quiz 
3. Print average scores for each quiz 
4. Print all statistics for each quiz 
5. EXIT ANALYTICS 

Enter your selection: one
Invalid selection. Please try again. 
Enter your selection: -1
Invalid selection. Please try again. 
Enter your selection: 10
Invalid selection. Please try again. 
Enter your selection: 1
Low scores: 0 7 0 32 

Enter your selection: 2
High scores: 100 100 100 90 

Enter your selection: 3
Average scores: 46.20 42.33 70.47 75.67 

Enter your selection: 4
High scores: 100 100 100 90 
Low scores: 0 7 0 32 
Average scores: 46.20 42.33 70.47 75.67 

Enter your selection: 5

Exiting analytics for file... 


*** END TEST CASE 1 ***

Current file: 1_record_with_header.txt

Select from the follwing options: 
1. Print high scores for each quiz 
2. Print low scores for each quiz 
3. Print average scores for each quiz 
4. Print all statistics for each quiz 
5. EXIT ANALYTICS 

Enter your selection: 1
Low scores: 95 1 99 78 

Enter your selection: 2
High scores: 95 1 99 78 

Enter your selection: 3
Average scores: 95.00 1.00 99.00 78.00 

Enter your selection: 4
High scores: 95 1 99 78 
Low scores: 95 1 99 78 
Average scores: 95.00 1.00 99.00 78.00 

Enter your selection: 5

Exiting analytics for file... 


*** END TEST CASE 2 ***

Current file: empty_with_header.txt

Student array is empty. 


Select from the follwing options: 
1. Print high scores for each quiz 
2. Print low scores for each quiz 
3. Print average scores for each quiz 
4. Print all statistics for each quiz 
5. EXIT ANALYTICS 

Enter your selection: 1
Low scores: 

Enter your selection: 2
High scores: 

Enter your selection: 3
Average scores: 

Enter your selection: 4
High scores: 
Low scores: 
Average scores: 

Enter your selection: 5

Exiting analytics for file... 


*** END TEST CASE 3 ***

Current file: 40_records_with_header.txt

Select from the follwing options: 
1. Print high scores for each quiz 
2. Print low scores for each quiz 
3. Print average scores for each quiz 
4. Print all statistics for each quiz 
5. EXIT ANALYTICS 

Enter your selection: 1
Low scores: 0 1 0 32 

Enter your selection: 2
High scores: 100 100 100 100 

Enter your selection: 3
Average scores: 47.60 42.30 69.78 76.80 

Enter your selection: 4
High scores: 100 100 100 100 
Low scores: 0 1 0 32 
Average scores: 47.60 42.30 69.78 76.80 

Enter your selection: 5

Exiting analytics for file... 


*** END TEST CASE 4 ***

Current file: 42_records_with_header.txt

Select from the follwing options: 
1. Print high scores for each quiz 
2. Print low scores for each quiz 
3. Print average scores for each quiz 
4. Print all statistics for each quiz 
5. EXIT ANALYTICS 

Enter your selection: 1
Low scores: 0 1 0 32 

Enter your selection: 2
High scores: 100 100 100 100 

Enter your selection: 3
Average scores: 47.60 42.30 69.78 76.80 

Enter your selection: 4
High scores: 100 100 100 100 
Low scores: 0 1 0 32 
Average scores: 47.60 42.30 69.78 76.80 

Enter your selection: 5

Exiting analytics for file... 


*** END TEST CASE 5 ***