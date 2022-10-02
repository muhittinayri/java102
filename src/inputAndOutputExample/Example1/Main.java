package inputAndOutputExample.Example1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0","-");
        File file = new File("src/inputAndOutputExample/Example1/example1");

        System.out.println(ayrac + "\n< Java Dosya İşlemleri >\n" + ayrac);
        if (file.exists()){
            System.out.println("-> Belirlemiş olduğunuz dizin üzerinde ilgili dosya bulunuyor.\n" + ayrac);
        }else {
            try {
                file.createNewFile();
                System.out.println("-> Dizin üzerinde dosya oluşturuldu. \n" + ayrac);
            }catch (IOException e){
                System.out.println("-> Dosya Oluşturulurken Hata Oluştu !!!\n-> Hata Mesajı: "+ e.getMessage()+"\n"+ayrac);
            }
        }
        System.out.println("Dosyanın adı : " + file.getName());
        System.out.println("Dosyanın dizin yolu : " + file.getPath() + "\n" + ayrac);
    }
}
