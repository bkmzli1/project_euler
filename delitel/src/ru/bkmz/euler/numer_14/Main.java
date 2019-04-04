package ru.bkmz.euler.numer_14;

public class Main {
    public static void main(String[] args) {
        long kollaca;
        int kol = 0, scet = 0, ii = 0;
        StringBuilder s = new StringBuilder();
        String ss = "";
        for (int i = 0; i < 999999; i++) {
            kollaca = i;
            while (kollaca > 1) {
                if (kollaca % 2 == 0) {
                    kollaca = kollaca / 2;
                    scet++;
                } else {
                    kollaca = 3 * kollaca + 1;
                    scet++;
                }

                s.append(" ").append(kollaca);
            }
            if (scet > kol) {
                ss = s.toString();
                kol = scet;
                ii = i;
            }
            s = new StringBuilder();
            scet = 0;
        }
        System.out.println(ss + "\n" + ii);
    }
}
