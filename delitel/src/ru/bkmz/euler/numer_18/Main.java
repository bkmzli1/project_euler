package ru.bkmz.euler.numer_18;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //triangle.txt with large data set works as well
        Scanner scanner = new Scanner(new File("res\\simple_triangle.txt"));

        ArrayList<int[]> triangle = new ArrayList<>();

        int counter = 1;
        int answer;

        while (scanner.hasNext()) {
            int[] arr = new int[counter];

            for (int i = 0; i < counter; i++) {
                arr[i] = scanner.nextInt();
            }

            triangle.add(counter - 1, arr);
            counter++;

        }

        for (int j = triangle.size() - 1; j > 0; j--) {
            for (int k = 0; k <= j - 1; k++) {
                triangle.get(j - 1)[k] = triangle.get(j - 1)[k] + Math.max(triangle.get(j)[k], triangle.get(j)[k + 1]);
            }
        }


        answer = triangle.get(0)[0];
        System.out.println(answer);


    }
}
