package Example.InheritanceExample;

public class TarimKredisi extends KrediTurleri{
    TarimKredisi (double krediTutari, int vadeSayisi){
        this.krediTutari = krediTutari;
        this.vadeSayisi = vadeSayisi;
        verilenKredi = "Tarım Kredisi";
        krediTuru = "Kampanyalı Çifçi";
        faizOrani = 0.14;
    }

    @Override
    double odenecekTutar(){
        return super.odenecekTutar() - (krediTutari * (faizOrani-0.02)+50);
    }
}
