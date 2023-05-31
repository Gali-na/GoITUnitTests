package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        try {
            System.out.println(sumCalculator.sum(0));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}