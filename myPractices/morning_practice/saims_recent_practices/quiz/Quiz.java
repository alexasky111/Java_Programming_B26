package morning_practice.saims_recent_practices.quiz;

public class Quiz {
    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumOfQuestions = totalNumOfQuestions;
        this.totalPoints = totalPoints;
    }
    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }
    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalNumOfQuestions=" + totalNumOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
