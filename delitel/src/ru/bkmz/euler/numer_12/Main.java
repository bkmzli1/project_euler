package ru.bkmz.euler.numer_12;

public class Main {
    public static void main(String[] args) {
        int input = 0, p = 0, result = 0;
        while (input < 500) {
            input = 0;
            p += 1;
            result += p;
            if (result % 2 == 0) {
                System.out.println("p:" + p);
                System.out.println("result:" + result);
                for (int i = 1; i <= Math.sqrt(result); i++) {
                    if (result % i == 0) {
                        input += 2;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
