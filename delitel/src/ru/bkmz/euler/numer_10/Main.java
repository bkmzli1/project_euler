package ru.bkmz.euler.numer_10;

import static ru.bkmz.euler.numer_7.Main.numer_7;

public class Main {
    public static void main(String[] args) {
        long sum = 0;
        long n;
        int a = 2000000;
        for (int i = 1; i <= a; i++) {
            n = numer_7(i);
            if (n < a) {
                sum = sum + n;
            }
            if (n > a) {
                break;
            }
        }
        System.out.println(sum);
    }
}
