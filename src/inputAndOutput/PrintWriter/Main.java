package inputAndOutput.PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "Java 102";
        try {
            PrintWriter writer = new PrintWriter("src/inputAndOutput/PrintWriter/patika.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
