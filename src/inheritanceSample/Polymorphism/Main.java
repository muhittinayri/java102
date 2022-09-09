package inheritanceSample.Polymorphism;

public class Main {
    public static void konustur(Object object){
        if (object instanceof Kopek){
            Kopek kopek = (Kopek)object;
            System.out.println(kopek.konus());
        }else if (object instanceof Kedi){
            Kedi kedi = (Kedi)object;
            System.out.println(kedi.konus());
        }else if (object instanceof At){
            At at = (At)object;
            System.out.println(at.konus());
        }else if (object instanceof Hayvan){
            Hayvan hayvan = (Hayvan)object;
            System.out.println(hayvan.konus());
        }
    }

    public static void main(String[] args) {

        //Temel Gösterim
        Kedi kedi = new Kedi("Nasip");

        if (kedi instanceof Kedi){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından");
        }


        //Fonksiyonla Gösterim

        Kedi kedi1 = new Kedi("Nasip");
        Kopek kopek1 = new Kopek("Zizu");
        At at1 = new At("BoldPilot");
        Hayvan hayvan1 = new Hayvan("Turunc");

        konustur(kedi1);
        konustur(kopek1);
        konustur(at1);
        konustur(hayvan1);
    }
}
