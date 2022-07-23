package gameProject.business.concretes;

import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;

public class SalesManager {

	public void sale(Game game, Campaign campaign, Player player) {
		game.setDiscountedPrice((1-campaign.getDiscountedRate())*game.getPrice());
        System.out.println(player.getFirstName()+" "+player.getLastName()+" has bought "+game.getName());
        System.out.println(game.getPrice());
        System.out.println(game.getDiscountedPrice());
	}
}
