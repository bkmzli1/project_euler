package ru.bkmz.euler.numer_2;

/**
 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println(fibonachi(12));
    }

    public static long fibonachi(long n) {
        int a = 1;
        int b = 1;

        int sum_fib = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            //System.out.print(sum_fib + " ");
            sum = sum + sum_fib;
        }
        //System.out.println(sum);
        return sum_fib;
    }
}