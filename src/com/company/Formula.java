package com.company;

public class Formula {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 10;
        double sP = (a + b + c) / 2.0;
        double rezultat = Math.sqrt(sP * (sP - a) * (sP - b) * (sP - c));

        System.out.println(sP);
        System.out.println(rezultat);
    }
}
