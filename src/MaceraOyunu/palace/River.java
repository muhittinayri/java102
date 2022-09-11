package MaceraOyunu.palace;

import MaceraOyunu.location.BattleLoc;
import MaceraOyunu.obstacle.Bear;
import MaceraOyunu.game.Player;

public class River extends BattleLoc {

    public River(Player player) {
        super(player,"Nehir", new Bear(), "water",2);
    }
}
