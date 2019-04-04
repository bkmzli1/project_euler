package ru.bkmz.euler.numer_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Простые делители числа 13195 - это 5, 7, 13 и 29.
 *
 * Каков самый большой делитель числа 600851475143, являющийся простым числом?
 * */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long timestart=System.currentTimeMillis() ;
        Collection col = new ArrayList();
        String s = scn.next();
        double x = Double.parseDouble(s);
        int i= 0;
        int number=0;
        double sqrt = Math.sqrt(x);
        double currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                col.add(multiplier);
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);

        }
        for (Object o : col){
            i = (int) o;
            number++;
            System.out.println("Множитель:"+number+" = "+o);
        }
        System.out.println("ответ:"+i);
        long timeend=System.currentTimeMillis() ;
        System.out.println(timeend-timestart);
    }
}