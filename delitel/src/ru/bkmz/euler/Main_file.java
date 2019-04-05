package ru.bkmz.euler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main_file {
    public static void main(String[] args) {
        for (int i = 20; i <= 661; i++) {
            File f = new File("src\\ru\\bkmz\\euler\\numer_" + i);
            f.mkdir();
            try {
                FileWriter fileWriter = new FileWriter(f + "\\Main.java");
                fileWriter.write("package ru.bkmz.euler.numer_" + i + ";\n" +
                        "\n" +
                        "public class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        \n" +
                        "    }\n" +
                        "}\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
