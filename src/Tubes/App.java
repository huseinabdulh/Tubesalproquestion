package Tubes;

import java.util.Scanner;

/**
 *
 * @author ASUS RYZEN
 */
public class App {
    //coba
    public static void main(String[] args) {
        String q1 = "1).Siapakah nama ayah nabi Muhammad saw?\n"
                + "(a)Abdullah\n(b)Aminah\n(c)Abu bakar\n";

        String q2 = "2).Pada tahun apakah nabi Muhammad saw dilahirkan?\n"
                + "(a)Asbabun nuzul\n(b)Gajah\n(c)Masehi\n";
        String q3 = "3).Percaya kepada Rasul adalah rukun iman yang keberapa?\n"
                + "(a)1\n(b)3\n(c)4\n";
        String q4 = "4).Berapa jumlah ayat yang terkandung dalam Surat Al-Ikhlas??\n"
                + "(a)1\n(b)3\n(c)4\n";
        String q5 = "5).Siapakah khalifah penerus/pengganti setelah Rasulullah wafat?\n"
                + "(a)Umar bin khatab\n(b)Abu bakar\n(c)Ali bin abi thalib\n";
        String q6 = "6).Dalam satu rakaat salat, terdapat berapa kali sujud?\n"
                + "(a)1\n(b)2\n(c)3\n";
        String q7 = "7).Al-Fatihah artinya?\n"
                + "(a)Pembukaan\n(b)Waktu subuh\n(c)Jin\n";
        String q8 = "8).Perbuatan menyekutukan Allah SWT disebut?\n"
                + "(a)Ghaib\n(b)Syirik\n(c)Baladoh\n";
        String q9 = "9).Tempat dimana Nabi Muhammad SAW menerima wahyu pertama?\n"
                + "(a)Jabal nur\n(b)Makkah\n(c)Gua hiro\n";
        String q10 = "10).Nabi Muhammad SAW berIshro-Mi’raj, untuk menerima perintah… ?\n"
                + "(a)Sholat\n(b)Zikir\n(c)Puasa\n";
        

        //array and the answer
        Question[] questions =  {
            new Question(q1, "a"),new Question(q2, "b"),new Question(q3, "c"),
            new Question(q4, "c"),new Question(q5, "b"),new Question(q6, "b"),
            new Question(q7, "a"),new Question(q8, "b"),new Question(q9, "c"),
            new Question(q10, "a"),
            
                
        };
        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question:"+questions[i].prompt);
            System.out.println("Answer :");String answer = a.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got "+ score+"/"+questions.length);
    }
}
