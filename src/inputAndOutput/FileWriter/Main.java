package inputAndOutput.FileWriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String data = "Java Öğreniyorum";
        try {
            FileWriter writerFile = new FileWriter("src/inputAndOutput/FileWriter/patika.txt");
            writerFile.write(data);
            writerFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

