package MaceraOyunu.palace;

import MaceraOyunu.location.BattleLoc;
import MaceraOyunu.obstacle.Vampire;
import MaceraOyunu.game.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player, "Orman",new Vampire(), "firewood",3);
    }
}
