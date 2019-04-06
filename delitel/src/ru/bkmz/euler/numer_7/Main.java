package ru.bkmz.euler.numer_7;

/**
 * Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-ое простое число - 13.
 * <p>
 * Какое число является 10001-ым простым числом?
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(numer_7(6));
    }

    public static long numer_7(int the_number_of_Prime_numbers) {
        long numberOfPrimes = 0;
        int number = 1;
        int maxLimit = 999999999;
        boolean[] sieve = new boolean[maxLimit];
        /*первый цикл проверяет счетчик

в нем есть подцикл

который осуществляет деление на делители

далее идет проверка

если хоть на один делитель разделилось,то нафиг это число

если нет, то к счетчику +1

и когда счетчик будет нужного значения, выводим текущее число*/
        for (int i = 2; i < maxLimit; i++) {
            if (sieve[i] == true) continue;
            numberOfPrimes++;

            if (numberOfPrimes == the_number_of_Prime_numbers) {
                number = i;
                break;
            }

            for (int j = i + i; j < maxLimit; j += i) {
                sieve[j] = true;
            }
        }
        System.out.println("Numer 7:" + number);
        return number;
    }
}