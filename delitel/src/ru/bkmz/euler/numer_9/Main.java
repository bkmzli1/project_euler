package ru.bkmz.euler.numer_9;

public class Main {
    static int a, b, c;
    static long sum;

    public static void main(String[] args) {
        for (a = 0; a < 1000; a++) {
            for (b = 0; b < 1000; b++) {
                for (c = 0; c < 1000; c++) {
                    if (a < b && b < c && (a + c + b) == 1000 && (a * a + b * b) == c * c) {
                        sum = a * b * c;
                        System.out.println("произведение: " + sum);
                        System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
                    }
                }
            }
        }
    }
}
