package com.company;

public class Main {

    public static void main(String[] args) {
	// methods cannot be within another method
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        //when calling the method you pass in the arguments
        calculateScore(gameOver, score , levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    // in the method itself they are called parameters
    public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelcompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }else {
            return -1;
        }
    }

}
