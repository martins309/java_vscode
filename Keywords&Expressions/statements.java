package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }else {
//            System.out.println("Got here");
//        }
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        //print out a second score on the screen with the following
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sur e the first printout above still displays as well

        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        if(gameOver) {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("This is the second final score " + finalScore);
        }

    }
}



