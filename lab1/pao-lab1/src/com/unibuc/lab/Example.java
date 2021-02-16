package com.unibuc.lab;

import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random myRandom = new Random(5);
        int myInt = myRandom.nextInt();
        System.out.println(myRandom.nextDouble());
    }
}
