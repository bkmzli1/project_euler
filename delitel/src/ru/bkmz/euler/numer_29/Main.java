package ru.bkmz.euler.numer_29;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet col1 = new HashSet();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                col1.add(Math.pow(i, j));
            }
        }

        System.out.println();
        System.out.println(col1.size());

        for (Object o : col1) {
            System.out.println("Item:" + o);
        }

    }
}