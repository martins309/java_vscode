package com.company;

public class Main {

    public static void main(String[] args) {
	// create a byte variable and sit it to an valid byte number
        //do the same for short
    // create an int variable set to any valid int number
    //create a long type that equals 50000 plus 10 times the
    //sum of the bye plus the short plus the integer values

       byte myNewByte = 121;
       short myNewShorty = 32765;
       int myNewInteger = 1238524903;
       long myNewLong = 50000L +  10L * (myNewByte + myNewShorty  + myNewInteger);
        System.out.println("This is a really big number = " + myNewLong);

    }
}
