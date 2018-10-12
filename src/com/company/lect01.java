package com.company;

public class lect01 {
    public static void main(String[] args) {
        int[] numbers = {43, 342, 1, 7, 3, 10};
       // boolean hasEvenNumber = false;
        int counter = 0;
        for (int x : numbers) {
            if (x % 2 == 0) {
                counter++;
                System.out.println(x);
               // hasEvenNumber = true;

            }
        }

       //System.out.println(" Has my array even number ? " + hasEvenNumber);
        System.out.println("My list has " + counter +  " even numebers");
    }
}


