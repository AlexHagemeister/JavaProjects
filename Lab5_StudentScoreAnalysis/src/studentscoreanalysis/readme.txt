Name: Alex Hagemeister
Course.Section: CIS D035A.63Z
Lab 5: Student Score Analysis
Due: 3/7/2023
Submitted: ______


Program Description:

    Performs statistical analysis of scores for a class of students (up to 40 students) from a .txt file,
    displaying all scores, along with the high, low, and average scores. 

Data: TestScores.txt

    There are five quizzes during the term, and each student is identified by a four-digit student ID number.
    The first line contains the column identifiers: Stud Qu1 Qu2 Qu3 Qu4 Qu5
    The subsequent lines contain the student ID number and the five quiz scores for that student, separated by spaces.

 
Program specs:

    Student class: Blueprint for a student object.

        Variables:
            - SID (private int) student ID #
            - scores[] (private int[]) array of quiz scores
            
        Methods:
            - Student() (public): default constructor
            - Student(int, int[]) (public): overloaded constructor
            - setSID(int) (public): sets SID
            - getSID() (public int): returns SID
            - setScores(int[]) (public): sets scores[]
            - getScores() (public int[]): returns scores[]
            - print() (public): prints SID and scores[]

    Statistics class: 

        Variables:
            - lowScores[] (private int[]): array of lowest scores
            - highScores[] (private int[]): array of highest scores
            - avgScores[] (private float[]): array of average scores

        Methods:
            - Statistics() (public): default constructor
            - Statistics(int[], int[], float[]) (public): overloaded constructor
            - findLow(Student[]) (public): finds lowest scores
            - findHigh(Student[]) (public): finds highest scores
            - findAvg(Student[]) (public): finds average scores
            - setLowScores(int[]) (public): sets lowScores[]
            - getLowScores() (public int[]): returns lowScores[]
            - setHighScores(int[]) (public): sets highScores[]
            - getHighScores() (public int[]): returns highScores[]
            - setAvgScores(float[]) (public): sets avgScores[]
            - getAvgScores() (public float[]): returns avgScores[]
            - print(int option) (public): prints lowScores[], highScores[], avgScores[], or all based on selection
            - print() (public): prints All - lowScores[], highScores[], avgScores[]


    Util class:

        Variables:
            - fName (private String): file name
            - FileReader object
            - students[] (private Student[]): array of Student objects
            - stats (private Statistics): Statistics object

        Methods:
            - Util() (public): default constructor
            - Util(String) (public): overloaded constructor
            - setFName(String) (public): sets fName
            - getFName() (public String): returns fName
            - setStudents(Student[]) (public): sets students[]
            - getStudents() (public Student[]): returns students[]
            - setStats(Statistics) (public): sets stats
            - getStats() (public Statistics): returns stats
            - readFile() (public): reads file and creates Student objects
            - printStudents() (public): prints all students
            - printStats() (public): prints stats
            - printMenu() (public): prints menu
            - printHeader() (public): prints header
            - printFooter() (public): prints footer
            - print() (public): prints all - header, menu, students, stats, footer

	ScoreStatisticsDriver class:

        Variables:
            - util (private Util): Util object

        Methods:
            - ScoreStatisticsDriver() (public): default constructor
            - ScoreStatisticsDriver(String) (public): overloaded constructor
            - setUtil(Util) (public): sets util
            - getUtil() (public Util): returns util
            - run() (public): runs program


Program design:


	Input:


	Processing:
	

	Printing:
	

	
	
***** PROGRAM OUTPUT *****