package com.company;

public class parsauimpar {
    public static void main(String[] args) {
        maxNumber();
        numarPar();
    }

    public static void maxNumber(){
        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("Max number is: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Max number is: " + b);
        }
        else System.out.println("Max number is: " + c);
    }

    public static void numarPar() {
        int a = 2;
        if (a % 2 == 0){
            System.out.println("Par");
        }
        else System.out.println("Impar");
    }
}
