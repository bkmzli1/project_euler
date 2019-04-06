package ru.bkmz.euler.numer_22;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "res\\names.txt", namesDell;//адрес текстого файла
        Optional<String> line = null;//Здесь будет храниться информацыя из файла
        ArrayList<String> name = new ArrayList<String>();//Здесь будет храниться все имена
        String[] names;// здесь будут все имена
        long lName, lSumName = 0, numerName = 0;
        String alfavit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//хранилище англ букв
        Map alfavitMap = new HashMap();//коллекцыя которая будет довать,что A = 1 B = 2 C =3 и тд
        char[] alfavitC = alfavit.toCharArray();//разбитие alfavit на отдельные буквы

        try {
            line = Files.lines(Paths.get(fileName)).findFirst();//загрузка файла
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
         * поскольку line имеет вид Option то при его перемещении в String мы получим Optional[....]
         * по этому мы очещаем его от ненужных нам компонентов при этом остовляя запятые
         */
        namesDell = line.toString();
        namesDell = namesDell.replace("Optional[", "");
        namesDell = namesDell.replace(String.valueOf('"'), "");
        namesDell = namesDell.replace("]", "");


        names = namesDell.split(",");//разделяем names на отдельные части при помощи запятых
        name.addAll(Arrays.asList(names));//загружаем names в колекцыю
        Collections.sort(name);//сортируем колекцыю
        /*
         *присваевам каждой букве англ алфавита цыфру
         */
        for (int i = 0; i < alfavitC.length; i++) {
            alfavitMap.put(alfavitC[i], i);
        }
        for (Object o : name) {// при помощи for мы перебераем всю коллекцыю с именами
            //полчаем имя и разделяем его на буквы
            String s = String.valueOf(o);
            char[] chars = s.toCharArray();
            lName = 0;//это сумма всех символов
            int k = 0;//для определения ставить знак + или нет
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
            numerName++;//номер имени
            lSumName += lName * numerName;//умножаем номер имени на сумму имени

        }
        System.out.println(lSumName);

    }
}
