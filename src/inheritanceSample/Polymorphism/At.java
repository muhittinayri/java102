package inheritanceSample.Polymorphism;

public class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    public String konus(){
        return this.getIsim() + " kişniyor";
    }
}
