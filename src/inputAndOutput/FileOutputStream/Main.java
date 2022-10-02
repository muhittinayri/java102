package inputAndOutput.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yazi = "\nOutputStream Ogreniyorum.\nPatika Dev";
        try {
            FileOutputStream output = new FileOutputStream("src/inputAndOutput/FileOutputStream/patika.txt",true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
