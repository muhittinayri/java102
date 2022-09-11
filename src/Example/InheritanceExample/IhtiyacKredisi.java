package Example.InheritanceExample;

public class IhtiyacKredisi extends KrediTurleri{
    IhtiyacKredisi (double krediTutari, int vadeSayisi){
        this.krediTutari = krediTutari;
        this.vadeSayisi = vadeSayisi;
        verilenKredi = "İhtiyaç Kredisi";
        krediTuru = "Standart";
        faizOrani = 0.25;
    }
}
