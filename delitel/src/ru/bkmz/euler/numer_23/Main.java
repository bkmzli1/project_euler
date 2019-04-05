package ru.bkmz.euler.numer_23;

import static ru.bkmz.euler.numer_2.Main.fibonachi;

public class Main {
    public static void main(String[] args) {
        char[] chars;
        int i = 1;
        while (true) {
            String s;
            s = String.valueOf(fibonachi(i));
            chars = s.toCharArray();
            int size = chars.length;
            if (size == 3) {
                System.out.println(i + 2);
                System.out.println(s);
                break;
            }
            i++;
        }
    }
}
