package inputAndOutput.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("src/inputAndOutput/PrintStream/output.txt");
            output.print(123123);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
