package com.company;

public class Main {

    public static void main(String[] args) {
	// float primitive type occupies 32 bits
        //doubles occupy 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("my min value float is = " + myMinFloatValue);
        System.out.println("my max float value is = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("my min value for double is = " + myMinDoubleValue);
        System.out.println("my max value for double is = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


    }
}
