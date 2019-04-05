package ru.bkmz.euler.numer_21;


public class Main {


    public static int div(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) sum += (number % i) == 0 ? i : 0;
        return sum;
    }

    public static void main(String[] args) {
        int x = 10000;
        int[] array = new int[x];
        for (int i = 1; i < x; i++) {
            int div = div(i);
            if (div < x && array[div] == i) System.out.println(div + "\t" + i);
            array[i] = div;
        }
    }

}
