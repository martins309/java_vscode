package com.company;

public class Main {

    public static void main(String[] args) {
	int result = 1+2; // 1+2=3
        System.out.println("This is the result = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("its not a tumor..");
            System.out.println("get out now!!");
        }

        int topScore = 90;
        if (topScore < 100) {
            System.out.println("You got a high score");
        }

        int secondTopScore = 60;
        //wrap the logical expressions in extra parenthesis to avoid confusion
        if ((topScore < secondTopScore) &&  (topScore < 10)) {
            System.out.println("Greater than top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore > 9)){
            System.out.println("I like eggs");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is a true");
        }

        boolean isCar = false;
        if (isCar ) {
            System.out.println("this is not supposed to happen");
        }
        //ternary tings
        int ageofClient = 20;
        boolean isOverEighteen = (ageofClient == 20) ? true : false;
        System.out.println("It looks like this is " + isOverEighteen);
    }
}
