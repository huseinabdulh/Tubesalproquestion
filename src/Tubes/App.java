package Tubes;

import java.util.Scanner;

/**
 *
 * @author ASUS RYZEN
 */
public class App {
    //coba
    public static void main(String[] args) {
        String q1 = "What color are apples?\n"
                + "(a)red/green\n(b)Orange\n(c)Magenta\n";

        String q2 = "What color are bananas?\n"
                + "(a)red/green\n(b)Yellow\n(c)Magenta\n";

        //array and the answer
        Question[] questions =  {
            new Question(q1, "a"),
            new Question(q2, "b")
        };
        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = a.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got "+ score+"/"+questions.length);
    }
}
