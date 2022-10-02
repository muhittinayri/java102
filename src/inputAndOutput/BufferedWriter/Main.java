package inputAndOutput.BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data = "Java Öğreniyorum !";
        File dosya = new File("src/inputAndOutput/BufferedWriter/patika.txt");
        try {
            FileWriter writeFile = new FileWriter(dosya);
            BufferedWriter writeBuff = new BufferedWriter(writeFile);
            writeBuff.write(data);
            writeBuff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
