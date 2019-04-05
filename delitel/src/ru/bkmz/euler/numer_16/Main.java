package ru.bkmz.euler.numer_16;

public class Main {
    public static void main(String[] args) {
        long pow = (long) Math.pow(2, 15);
        String s = String.valueOf(pow);
        char[] ch = s.toCharArray();
        long doub = 0;
        for (char c : ch) {
            String ss = String.valueOf(c);
            doub += Long.parseLong(ss);
        }
        System.out.println(doub);
    }
}
