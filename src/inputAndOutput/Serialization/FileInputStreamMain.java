package inputAndOutput.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileInputStreamMain {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A3");
        try {
            FileInputStream inputFile = new FileInputStream("src/inputAndOutput/Serialization/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
