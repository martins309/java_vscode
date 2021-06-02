package com.company;

public class Main {

    //create a double variable with a value of 20.00
    //create a second variable with a value of 80.00
    //add both numbers together and multiply  by 100.00
    //use the remainder operator to figure out what the remainder from the result of the operation
    //create a boolean variable that assigns the value true if the remainder in #4 is 0 or false !zero
    //output the boolean variable
    // write an if then statement that displays a message "Got some remainder" if the boolean in step 5 is not true;
    
    
    public static void main(String[] args) {
	double myDouble = 20.00;
	double secondDouble = 80.00;
	double result = (myDouble + secondDouble) * 100.00;
        System.out.println(result);

        double myRemainder = result % 40.00;
        System.out.println(myRemainder);
        boolean isZero = (myRemainder == 0) ? true : false;
        System.out.println("The result is .." + isZero);
        if((isZero == true) && (myRemainder <= 0) ) {
            System.out.println("We don't have a remainder");
        }
    }
}
