package ru.bkmz.euler.numer_5;
/**
 * 2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
 *
 * Какое самое маленькое число делится нацело на все числа от 1 до 20?
* */
public class Main {
    public static void main(String[] args) {
        System.out.println(Nan(1,20));
    }
    static String Nan(int y, int x){
        int n = 1;


        while (y <= x) {
            if (n % y == 0) {
                y++;
            } else {
                n++;
                y = 1;
            }
        }
        return String.valueOf(n);
    }

}
