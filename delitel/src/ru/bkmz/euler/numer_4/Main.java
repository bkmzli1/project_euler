package ru.bkmz.euler.numer_4;
/**
 * Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково. Самое большое число-палиндром,
 * полученное умножением двух двузначных чисел – 9009 = 91 × 99.
 *
 * Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
 * */
public class Main {

    public static void main(String[] args) {
        int value = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                int value1 = i * j;
                StringBuilder sb1 = new StringBuilder("" + value1);
                String sb2 = "" + value1;
                sb1.reverse();
                if (sb2.equals(sb1.toString()) && value < value1) {
                    value = value1;

                }
            }
        }

        System.out.println(value);
    }
}
