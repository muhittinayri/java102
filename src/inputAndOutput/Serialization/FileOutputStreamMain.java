package inputAndOutput.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutputStreamMain {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A3");
        try {
            FileOutputStream outputFile = new FileOutputStream("src/inputAndOutput/Serialization/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            e.printStackTrace()
            ;

        }



    }
}
