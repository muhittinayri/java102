package Example.InheritanceExample;

public class KrediTurleri {
    String verilenKredi, krediTuru;
    int vadeSayisi;
    double krediTutari, faizOrani;

    double odenecekTutar(){
        return krediTutari + ((krediTutari / vadeSayisi) * faizOrani * vadeSayisi);
    }

    String krediBilgileri(){
        return "-> Kredi İsmi : " + verilenKredi + "\n-> Kredi Türü : " + krediTuru + "\n-> Alınan Kredi Miktarı : " + krediTutari + "\n-> Faiz Oranı : " + faizOrani
                + "\t Vade Sayısı : " + vadeSayisi + "\n-> Odenecek Tutar : " + odenecekTutar();
    }
}
