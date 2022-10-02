package inputAndOutput.File;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("src/inputAndOutput/File/patika.txt");
        try {
            if (dosya.createNewFile()){
                System.out.println(dosya.getName() + " dosyası oluşturuldu !");
            }else {
                System.out.println(dosya.getName() + " dosyası zaten mevcut !");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
