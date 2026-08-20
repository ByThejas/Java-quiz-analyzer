import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answers;
        int score = 0;
        int wrong = 0;
        double percentage;

        String questions[] = new String[5];
        int correctAnswers[] = new int[5];
        int userAnswers[] = new int[5];

        questions[0] = "Question 1:\nWhat is 2+2?\nYour answer: ";
        questions[1] = "\nQuestion 2:\nWhat is 5+5?\nYour answer: ";
        questions[2] = "\nQuestion 3:\nWhat is 10+10?\nYour answer: ";
        questions[3] = "\nQuestion 4:\nWhat is 4-2?\nYour answer: ";
        questions[4] = "\nQuestion 5:\nWhat is 10-6?\nYour answer: ";

        correctAnswers[0] = 4;
        correctAnswers[1] = 10;
        correctAnswers[2] = 20;
        correctAnswers[3] = 2;
        correctAnswers[4] = 4;

        System.out.println("================================\n\t\t  JAVA QUIZ\n================================");

        for(int i = 0 ; i < questions.length ; i++){
            System.out.print(questions[i]);
            answers = scan.nextInt();
            userAnswers[i] = answers;
            if(correctAnswers[i] ==  userAnswers[i]){
                score++;
            }
            else {
                wrong++;
            }
        }
        System.out.println("\n===== RESULT =====");

        System.out.println("Score is: " + score + "/" + questions.length);
        System.out.println("Wrong answers: " + wrong);
        percentage = (double)score / questions.length * 100;
        System.out.println("Percentage: " + percentage + "%");

        for (int i = 0 ; i < questions.length ; i++){

            if(correctAnswers[i] == userAnswers[i]){
                System.out.println("\nQuestion " + (i+1) + ": Correct");
            }
            else{
                System.out.println("\nQuestion " + (i+1) + ": Wrong");
                System.out.println("Your answer: " + userAnswers[i]);
                System.out.println("Correct answer: " + correctAnswers[i]);
            }
        }
        }
    }
