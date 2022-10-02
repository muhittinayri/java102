package inputAndOutput.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("src/inputAndOutput/FileInputStream/patika.txt");
            System.out.println("Kullanılabilir byte Sayısı : " + inputStream.available());
            //inputStream.skip(10);
            int i = inputStream.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
