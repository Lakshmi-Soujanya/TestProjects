package com.LearnJava.online;



public class Condinaloperators {
    public static void main(String[] args) {
        Condinaloperators a = new Condinaloperators() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

        Condinaloperators b = a;

        Condinaloperators c = new Condinaloperators() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

        boolean b1 = a == b;
        boolean b2 = b.equals(b);
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}