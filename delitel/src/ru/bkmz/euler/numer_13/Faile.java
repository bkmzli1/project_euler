package ru.bkmz.euler.numer_13;

import java.io.FileReader;
import java.io.IOException;

public class Faile {

    private static String s;

    private static String failRid() throws IOException {

        FileReader reader = new FileReader("res\\numer_13.txt");
        int c;
        while ((c = reader.read()) != -1) {
            s = s + c;

        }
        s = s.replace("null", "");
        return s;
    }

    public String getS() {
        try {
            return failRid();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
