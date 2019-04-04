package ru.bkmz.euler.numer_13;


public class Main {
    public static void main(String[] args) {
        Faile file = new Faile();
        String numbers = file.getS();
        char[] numerc = numbers.toCharArray();
        long[] numer = new long[numerc.length];
        for (int i = 0; i < numerc.length; i++) {
            numer[i] = numerc[i];
        }
        long sum = 0;
        for (long l : numer) {
            sum += l;
        }
        System.out.println(sum);
        numbers = String.valueOf(sum);
        numerc = numbers.toCharArray();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(numerc);
        }
    }
}
