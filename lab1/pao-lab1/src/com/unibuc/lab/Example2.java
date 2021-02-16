package com.unibuc.lab;

public class Example2 {
    public static void main(String[] args) {
        int totalNumbers = 100;
        getOddNumbers(totalNumbers);
        System.out.println();
        getOddNumbers(70);
    }

    public static void getOddNumbers(int totalNumbers) {
        for (int i = 1; i < totalNumbers; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
