package com.paper.chk.array;

import java.util.Scanner;

public class QuizService {

    Question[] questions;
    int score = 0;

    public QuizService(Question[] questions) {
        this.questions = questions;
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];

            System.out.println("\nQ" + (i + 1) + ". " + q.question);

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((char)('A' + j) + ". " + q.options[j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == q.correctAnswer) {
                score++;
                System.out.println("Correct..");
            } else {
                System.out.println("Wrong.. Correct answer is: " + q.correctAnswer);
            }
        }

        System.out.println("\n Final Score: " + score + " / " + questions.length);
        sc.close();
    }
}
