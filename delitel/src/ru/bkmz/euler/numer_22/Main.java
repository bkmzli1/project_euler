package ru.bkmz.euler.numer_22;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "res\\names.txt", namesDell;
        Optional<String> line = null;
        ArrayList<String> name = new ArrayList<String>();
        String[] names;
        long lName, lSumName = 0, numerName = 0;
        String alfavit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alfavitC = alfavit.toCharArray();
        Map alfavitMap = new HashMap();
        try {
            line = Files.lines(Paths.get(fileName)).findFirst();
        } catch (IOException e) {
            e.printStackTrace();
        }
        namesDell = line.toString();
        namesDell = namesDell.replace("Optional[", "");
        namesDell = namesDell.replace(String.valueOf('"'), "");
        namesDell = namesDell.replace("]", "");


        names = namesDell.split(",");
        name.addAll(Arrays.asList(names));
        Collections.sort(name);
        for (int i = 0; i < alfavitC.length; i++) {
            alfavitMap.put(alfavitC[i], i);
        }
        for (Object o :
                name) {
            String s = String.valueOf(o);
            char[] chars = s.toCharArray();
            lName = 0;
            int k = 0;
            for (int i = 0; i < chars.length; i++) {

                lName += (int) alfavitMap.get(chars[i]) + 1;
                if (k != 0) {
                    System.out.print("+" + ((int) alfavitMap.get(chars[i]) + 1));
                } else {
                    System.out.println(o + ":");
                    System.out.print(((int) alfavitMap.get(chars[i]) + 1));
                }
                k++;

            }
            System.out.println("=" + lName);
            numerName++;
            lSumName += lName * numerName;

        }
        System.out.println(lSumName);

    }
}
