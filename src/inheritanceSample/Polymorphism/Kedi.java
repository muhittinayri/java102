package inheritanceSample.Polymorphism;

public class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus(){
        return this.getIsim() + " Miyavlıyor";
    }
}
