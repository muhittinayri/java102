package inputAndOutputExample.Example2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0","-");
        File dosya = new File("src/inputAndOutputExample/Example2/example2");
        System.out.println("\n < Java Dosya İşlemlerinin Metot Yapıları > \n" + ayrac);
        if (dosya.exists()){
            System.out.println("Belirtilen dizin yolunda, belirtmiş olduğunuz dosya zaten mevcut.\n" + ayrac);
        }else {
            try {
                dosya.createNewFile();
                System.out.println("-> Başarılı bir şekilde, dizin üzerinde belirtmiş olduğunuz isimde dosya oluşturuldu\n" + ayrac);
            }catch (IOException e){
                System.out.println("-> Dosya oluşturulurken hata oluştu ! \n - >Hatanın mesajı : " + e.getMessage() + "\n" + ayrac);
            }
        }
        System.out.println("-> Dosyanın adı : " + dosya.getName() + "\n-> Dosyanın dizin yolu : " + dosya.getPath());
        System.out.println("-> Dosyanın Boyutu : " + dosya.length() + "\n-> Dosyanın okunabilirlik Durumu : " + dosya.canRead());
        System.out.println("-> Dosyanın Mevcut Adını [\""+dosya.getName()+"\"] Değiştirerek [\"dosya-metotlari.txt\"] Yapalım.");
        File degistir = new File("src/inputAndOutputExample/Example2/dosya-metotlari.txt");
        dosya.renameTo(degistir);
        System.out.println("-> Dosyayı Silelim : " + dosya.delete() + "\n->Dosya Mevcut Mu : " + dosya.exists() + "\n" + ayrac);
    }
}
