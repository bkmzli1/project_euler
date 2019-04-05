package ru.bkmz.euler.numer_15;

public class Main {
    public static void main(String[] args) {
        double a, x, fx, fa;
        x = 20;
        a = x * 2;
        fx = Factorial.factorial(x) * Factorial.factorial(x);
        fa = Factorial.factorial(a);
        System.out.println(fa / fx);
    }
}

class Factorial {
    static double factorial(double x) //в данном случае методу factorial передаётся x,
    //сам он возвращает некое значение типа int
    {
        if (x < 0) throw new IllegalArgumentException("x должен быть >=0");// обработка исключительной ситуации
        double fact = 1;
        for (double i = 2; i <= x; i++) // на 1 умножать смысла нет, начинаем с 2. Умножаем, пока i<= числу, для которого
            fact *= i;            // вычисляется факториал. fact*=i это сокращение для fact=fact*i
        return fact;        // возвращаем методу значение факториала, который мы только что вычислили
    }
}
