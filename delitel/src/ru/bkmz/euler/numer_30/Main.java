package ru.bkmz.euler.numer_30;

public class Main {
    public static void main(String[] args) {
        for (int i = 1634; i <= 9474; i++) {
            if (sumStepeni(String.valueOf(i)) == i) {
                System.out.println(i);
            }
        }
    }

    private static long sumStepeni(String numers) {
        long sum = 0;
        char[] numersC = numers.toCharArray();
        long[] number = new long[numersC.length];
        for (int i = 0; i < numersC.length; i++) {
            number[i] = Long.parseLong(String.valueOf(numersC[i]));
        }
        for (long l : number) {
            sum += (long) Math.pow(l, number.length);
        }
        return sum;

    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}
