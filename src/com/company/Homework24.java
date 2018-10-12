package com.company;

public class Homework24 {
    public static void main(String[] args) {
        // Ecuatie de gradul II
        double a = 1;
        double b = -6;
        double d = 8;
               double x1 , x2;
               double o = b*b-4*a*d;
               x1 = ( ( -b + Math.sqrt(o)) / (2 * a));
               x2 = ( ( -b - Math.sqrt(o)) / (2 * a));
               System.out.println((x1));
               System.out.println(x2);
    }
}

