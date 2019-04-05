package ru.bkmz.euler.numer_20;

public class Main {
    public static void main(String[] args) {
        String s = String.valueOf(factorial(10));
        char[] ch = s.toCharArray();
        long sum = 0;
        for (char c : ch) {
            sum += Long.parseLong(String.valueOf(c));
        }
        System.out.println(sum);
    }

    private static long factorial(int x) //в данном случае методу factorial передаётся x,
    //сам он возвращает некое значение типа int
    {
        if (x < 0) throw new IllegalArgumentException("x должен быть >=0");// обработка исключительной ситуации
        long fact = 1;
        for (int i = 2; i <= x; i++) // на 1 умножать смысла нет, начинаем с 2. Умножаем, пока i<= числу, для которого
            fact *= i;            // вычисляется факториал. fact*=i это сокращение для fact=fact*i
        return fact;        // возвращаем методу значение факториала, который мы только что вычислили
    }
}
