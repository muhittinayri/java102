package collection.Map;

import java.util.HashMap;

public class HashMapExam1 {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0", "-");
        HashMap hMap = new HashMap();

        hMap.put(183006029,"Ali İhsan");
        hMap.put(183006042,"Emre");
        hMap.put(183006055,"Mert");
        hMap.put(183006058,"Ömer Faruk");

        System.out.println(ayrac + "\n< Java HashMap Metotları >\n" + ayrac);
        System.out.println("-> Eşleşen Veriler (entrySet) : " + hMap.entrySet() + "\n" + ayrac);
        System.out.println("-> HashMap İçerisindeki Değerlerin Sayısı (size) : " + hMap.size());
        System.out.println("-> HashMap İçerisindeki get(183006055) Kullanımı : " + hMap.get(183006055));
        System.out.println("-> HashMap Üzerinde remove(183006055) Kullanımı : " + hMap.remove(183006055));
        System.out.println("-> HashMap Üzerinde containsValue(\"Mert\") Kullanımı : " + hMap.containsValue("Mert"));
        System.out.println("-> Anahtar Verileri (keySet) : " + hMap.keySet());
        System.out.println("-> HashMap İçerisindeki Değerler (values) : " + hMap.values());
        System.out.println("-> HashCode Değerimiz (hashCode) : " + hMap.hashCode() + "\n" + ayrac);
    }
}
