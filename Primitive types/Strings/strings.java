package com.company;

public class Main {

    public static void main(String[] args) {
    //Strings are not primitive types
        //they are also immutable

        String myString = "I am the shit";
        System.out.println("Always remember my nigga " + myString);
        myString = myString + ", and don't you mother fucking forget it";
        System.out.println(myString);
        myString = myString + "\u00A9";
        System.out.println(myString + "OGM MEDIA 2019");
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
