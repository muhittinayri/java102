package MaceraOyunu.game;

import MaceraOyunu.location.Location;
import MaceraOyunu.location.SafeHouse;
import MaceraOyunu.location.ToolStore;
import MaceraOyunu.palace.Cave;
import MaceraOyunu.palace.Forest;
import MaceraOyunu.palace.River;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoş Geldiniz.");
        System.out.println("Lütfen Bir İsim Giriniz :");
        //String playerName = input.nextLine();
        Player player = new Player("Muhittin");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz ! Burada yaşananların hepsi gerçek !");
        System.out.println("Lütfen bir karakter seçiniz ! ");
        System.out.println("##############################################################################################");
        player.selectChar();

        Location location = null;

        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("############ Bölgeler ############");
            System.out.println();
            System.out.println("1 - Güvenli Ev  --> Burası sizin için güvenli bir ev, düşman yoktur !");
            System.out.println("2 - Eşya Dükkanı --> Silah veya Zırh satın alabilirsiniz !");
            System.out.println("3 - Mağara --> Ödül <Yemek>, Dikkatli karşına ol zombi çıkabilir !");
            System.out.println("4 - Ormana --> Ödül <Odun>, Dikkatli karşına ol vampir çıkabilir !");
            System.out.println("5 - Nehir --> Ödeül <Su>, Dikkatli karşına ol ayı çıkabilir !");
            System.out.println("0 - Çıkış Yap --> Oyunu Sonlandır !");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();

            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location= new Cave(player);
                    break;
                case 4:
                    location= new Forest(player);
                    break;
                case 5:
                    location= new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz.");
                    location = new SafeHouse(player);
            }

            if (location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin :)");
                break;
            }
            if (!location.onLocation()){
                System.out.println("Game Over !");
                break;
            }
        }
    }
}
