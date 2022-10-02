package inputAndOutput.OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        String data = "ĞÜŞİ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/inputAndOutput/OutputStreamWriter/patika.txt");
            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
            fileWriter.write(data);
            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
