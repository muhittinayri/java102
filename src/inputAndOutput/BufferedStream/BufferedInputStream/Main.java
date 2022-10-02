package inputAndOutput.BufferedStream.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("src/inputAndOutput/BufferedStream/BufferedInputStream/patika.text");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int i = bufferedInput.read();
            while (i != -1){
                System.out.print((char) i);
                i = bufferedInput.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
