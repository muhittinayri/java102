package MaceraOyunu.palace;

import MaceraOyunu.location.BattleLoc;
import MaceraOyunu.obstacle.Zombie;
import MaceraOyunu.game.Player;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Mağara",new Zombie(), "food",3);
    }
}
