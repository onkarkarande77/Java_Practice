package com.paper.chk.array;

public class QuizApp {

    public static void main(String[] args) {

        Question[] questions = new Question[10];

        questions[0] = new Question(
                "What is the size of int in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"},
                'B'
        );

        questions[1] = new Question(
                "Which keyword is used to inherit a class?",
                new String[]{"this", "super", "extends", "implements"},
                'C'
        );

        questions[2] = new Question(
                "Which method is the entry point of Java program?",
                new String[]{"start()", "main()", "run()", "init()"},
                'B'
        );

        questions[3] = new Question(
                "Which is not an OOP concept?",
                new String[]{"Inheritance", "Polymorphism", "Compilation", "Encapsulation"},
                'C'
        );

        questions[4] = new Question(
                "Which collection allows duplicate values?",
                new String[]{"Set", "Map", "List", "None"},
                'C'
        );

        questions[5] = new Question(
                "Which keyword is used to create object?",
                new String[]{"class", "new", "object", "create"},
                'B'
        );

        questions[6] = new Question(
                "Which exception is unchecked?",
                new String[]{"IOException", "SQLException", "NullPointerException", "ClassNotFoundException"},
                'C'
        );

        questions[7] = new Question(
                "Which loop is guaranteed to execute at least once?",
                new String[]{"for", "while", "do-while", "foreach"},
                'C'
        );

        questions[8] = new Question(
                "Which package contains Scanner class?",
                new String[]{"java.io", "java.util", "java.lang", "java.sql"},
                'B'
        );

        questions[9] = new Question(
                "Which keyword prevents inheritance?",
                new String[]{"static", "final", "private", "protected"},
                'B'
        );

        QuizService quizService = new QuizService(questions);
        quizService.startQuiz();
    }
}

