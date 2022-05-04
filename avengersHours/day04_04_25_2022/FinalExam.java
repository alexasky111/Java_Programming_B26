package day04_04_25_2022;

public class FinalExam extends GradeActivity {
    /*
      - Create a class FinalExam (subclass of GradeActivity)
                     - Instance variables: -int numQuestion (total question number in the exam)
                                       -double pointsEach  (points per each question)
                                       -int numMissed   (number of wrong answers)
     */

    int numQuestion;
    double pointsEach;
    int numMissed;


    /*
    - Constructor; parameters -> numQuestions, numMissed
                        assign these parameters

                     - Instance method ; calcNumericScore()
                         first calculate the pointsEach  (based on 100 pts)
                         then declare a numericScore variable and calculate => formula;  (100-(numMissed*pointsEach))
                         then call setScore() method with numericScore variable

     */
    public FinalExam(int numQuestion, int numMissed) {
        this.numQuestion = numQuestion;
        this.numMissed = numMissed;
        calcNumericScore();
    }

    public void calcNumericScore() {

        pointsEach = 100 / numQuestion;
        double numericScore = (100 - (numMissed * pointsEach));
        setScore(numericScore); // it is set to the getScore()

    }



}
