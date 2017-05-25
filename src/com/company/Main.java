package com.company;

public class Main {

    public static void main(String[] args) {
        //int x=0;
        //System.out.println((++x) + " - How do Sout with including plus ");
        //System.out.println((++x) + " - This is my new program");
        System.out.println("INTEIRO:" + 23/3 + " E RESTO:" + 23%3);
        for (int y=1; y<=100; ++y) {
            if (y % 3 == 0 && y % 5 == 0) {
                System.out.println("Fizz Bizz");
            } else {
                if (y % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    if (y % 5 == 0) {
                        System.out.println("Bizz");
                    } else {
                        System.out.println(y);
                    }
                }
            }
        }
    }
}
