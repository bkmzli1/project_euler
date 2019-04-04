package ru.bkmz.euler.numer_6;
/**
 * Сумма квадратов первых десяти натуральных чисел равна
 *
 * 12 + 22 + ... + 102 = 385
 * Квадрат суммы первых десяти натуральных чисел равен
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел составляет 3025 − 385 = 2640.
 *
 * Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
 * */
public class Main {
    public static void main(String[] args) {
        int sum_kvadruk=0;
        int kvadruk_sum=0;
        int sum=0;
        int sumAll;
        for (int i = 0; i <= 10; i++) {
            sum_kvadruk = sum_kvadruk + (i*i);
        }
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        kvadruk_sum=sum*sum;

        System.out.println(kvadruk_sum-sum_kvadruk);

    }
}
