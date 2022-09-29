package collection.LinkedList;

public class ListMain {
    public static void main(String[] args) {
        String ayrac = new String(new char[10]).replace("\0","-");
        ListManager listManager = new ListManager();
        listManager.listFirstAdd(120);
        listManager.listLastAdd(962);
        listManager.listFirstAdd(632);
        listManager.listFirstAdd(317);
        System.out.println(ayrac+"\n< Linked List Kullanımı >\n"+ayrac);
        System.out.print("-> Tanımladığımız Linked List Verileri :");
        listManager.listWrite();
        listManager.listLastAdd(149);
        listManager.listFirstAdd(829);
        System.out.print("\n"+ayrac+"\n-> Yeni Eklenen Veri İle Linked List Yapısı: ");
        listManager.listWrite();
        System.out.println("\n"+ayrac);
    }
}
