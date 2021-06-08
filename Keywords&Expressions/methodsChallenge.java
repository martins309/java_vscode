package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a method called displayHighScorePosition
        //it should have a players name as a parameter and a second parameter as a position in the high score table
        //you should display the players name along with a message like "managed to get into position and the
        //position they got and a further message "on the high score table"

        //create a second method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return int
        //the return data should be
        //1 if the score is >1000
        //2 if the score is >500 and < 1000
        //3 if the score is >100 and < 500
        //4 in all other cases
        // call both methods and display the results of the following
        //a score of 1500 900 400 and 50

        int playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("joe", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("ray", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("mimi",  playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("fayaz", playerPosition);


    }
    public static void displayHighScorePosition(String name, int playerPosition) {
        System.out.println(name + " managed to get into position " + playerPosition + " on the highscore table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }else if(playerScore >= 100) {
            return 3;
        }else {
            return 4;
        }
    }
}
