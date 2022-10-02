package inputAndOutput.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src/inputAndOutput/BufferedReader/patika.txt");
            BufferedReader readBuff = new BufferedReader(readFile);
            /*
            String line = readBuff.readLine();
            while (line != null){
                System.out.println(line);
                line = readBuff.readLine();
            }
             */

            String line;
            while ((line = readBuff.readLine()) != null){
                System.out.println(line + "####");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
