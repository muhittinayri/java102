package inputAndOutput.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src/inputAndOutput/FileReader/patika.txt");
            int i = readFile.read();
            while (i != -1){
                System.out.print((char) i);
                i = readFile.read();
            }
            readFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
