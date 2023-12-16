import java.util.Scanner;

public class Quiz {
    int score = 100;
    ArrayList<Questions> questions;

    public Quiz(int score, ArrayList<Questions> questions) {
        this.score = score;
        this.questions = questions;
    }

    void addQuestion() {
        Questions question = new Questions
    }

    int takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("a) " + questions[i][1][0]);
            System.out.println("b) " + questions[i][1][1]);
            System.out.println("c) " + questions[i][1][2]);
            System.out.println("d) " + questions[i][1][3]);
            
            String answer = scanner.nextLine();
            if (answer == questions[i][2]) {
                System.out.println("Correct!");
            } else {
                System.out.println("That is incorrect. The correct answer was " + questions[i][2]);
            }


        }
    }
}