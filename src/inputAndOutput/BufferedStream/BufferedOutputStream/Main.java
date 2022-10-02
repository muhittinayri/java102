package inputAndOutput.BufferedStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String data = "Java 102 Patikası";
        try {
            FileOutputStream file = new FileOutputStream("src/inputAndOutput/BufferedStream/BufferedOutputStream/patika.text");
            BufferedOutputStream buffFile = new BufferedOutputStream(file);
            byte[] byteArray = data.getBytes();

            buffFile.write(byteArray);
            buffFile.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
