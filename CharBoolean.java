package com.company;

//char occupies 2 bytes of memory or 16 bytes and not a single byte because of its ability to store unicode
//Unicode is the international encoding standard for use with different languages and scripts

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
