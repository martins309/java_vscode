package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntVaule = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntVaule);
        System.out.println(("bust value is = " + (myMaxIntVaule + 1)));

        int myMaxValueTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + Byte.MIN_VALUE);
        System.out.println("Byte maximum value = " + Byte.MAX_VALUE);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short minimum value = " + Short.MIN_VALUE);
        System.out.println("short maximum value = " + Short.MAX_VALUE);

        long myLongValue = 100L;
        long MyMinShortValue = Long.MIN_VALUE;
        long MyMaxShortValue = Long.MAX_VALUE;
        System.out.println("longminimum value = " + Long.MIN_VALUE);
        System.out.println("longmaximum value = " + Long.MAX_VALUE);
        long bigLongLiteralValue = 2_147_483_647_234L;
        short myBigLongLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte  myNewByteValue = (byte) (myMinByteValue / 2);

    }
}

